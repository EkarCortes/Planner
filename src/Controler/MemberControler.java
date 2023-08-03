package Controler;

import Models.Members.Member;
import Models.Members.MemberList;
import View.View;


public class MemberControler implements Controler<Member> {
    private MemberList list; 
    private View<Member> view; 

   
    public MemberControler(View<Member> view) {
        this.list = new MemberList(); 
        this.view = view; 
    }

    @Override
    public void insert(Member member) {
        if (member.isComplete()) {
            list.insert(member);
            view.displayMessaje("Miembro agregado exitosamente.");
            readAll();
        } else {
            view.displayErrorMessaje("No se puede agregar el miembro. Faltan datos.");
        }
    }

    @Override
    public void update(Member member) {
        if (member.isComplete()) {
            list.update(member);
            view.displayMessaje("Miembro actualizado exitosamente.");
            readAll();
        } else {
            view.displayErrorMessaje("No se puede actualizar el miembro. Faltan datos.");
        }
    }

    @Override
    public void delete(Member member) {
        if (list.delete(member)) {
            view.displayMessaje("Miembro eliminado exitosamente.");
            readAll();
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
