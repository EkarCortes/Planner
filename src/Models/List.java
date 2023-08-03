/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Models;



/**
 *
 * @author ekard
 */
public interface List<Type> {
public boolean insert(Type obj);
public boolean delete(Type obj);
public Type search(Object id);
public Type[] toArray();
}
