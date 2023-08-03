/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models.Members;

import Models.List;
import java.util.HashMap;

/**
 *
 * @author ekard
 */
public class MemberList implements List<Member> {

    // HashMap to store members
    private HashMap<String, Member> members;

    public MemberList() {
        members = new HashMap<>();
    }

    @Override
    public boolean insert(Member obj) {
        if (obj != null && obj.getId() != null && !obj.getId().isEmpty()) {
            members.put(obj.getId(), obj);
            return true;
        }
        return false;
    }

    public boolean update(Member obj) {
        return insert(obj); 
    }

    @Override
    public boolean delete(Member obj) {
        if (obj != null && obj.getId() != null && !obj.getId().isEmpty()) {
            Member removedMember = members.remove(obj.getId());
            return removedMember != null;
        }
        return false;
    }

    @Override
    public Member search(Object id) {
        if (id instanceof String) {
            return members.get(id);
        }
        return null;
    }

    @Override
    public Member[] toArray() {
        return members.values().toArray(new Member[0]);
    }
    
     public void showAll(){
         for (Member member : members.values()){
             System.out.println(member); 
         }
 }
}
