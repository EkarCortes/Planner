package Controler;

import Models.Members.Member;
import Models.Members.MemberList;
import View.View;


public class MemberControler implements Controler<Member> {
    private MemberList list; 
    private View view; 

   
    public MemberControler(View view) {
        list=MemberList.getInstance();
        this.view = view; 
    }

    @Override
    public void insert(Member member) {
        if (member.isComplete()) {
            list.insert(member);
            this.readAll();
        } else {
            view.displayErrorMessaje("Faltan datos, No se pudo agregar el miembro.");
        }
    }

    @Override
    public void update(Member member) {
        if (member.isComplete()) {
            list.update(member);
            this.readAll();
        } else {
            view.displayErrorMessaje("No se puede actualizar el miembro. Faltan datos.");
        }
    }

    @Override
    public void delete(Member member) {
        if (list.delete(member)) {
            this.readAll();
        } else {
            view.displayErrorMessaje("No se puede eliminar el miembro. No se encontró en la lista.");
        }
    }

    @Override
    public void read(Object id) {
        Member member = list.search(id);
        if (member != null) {
            view.display(member);
        } else {
            view.displayErrorMessaje("No se encontró el miembro con el ID proporcionado.");
        }
    }

    @Override
    public void readAll() {
        Member[] members = list.toArray();
        if (members.length > 0) {
            view.displayAll(members);
        }
    }
}
