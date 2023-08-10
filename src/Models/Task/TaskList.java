package Models.Task;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import Models.List;
import Models.Members.Member;
import java.util.ArrayList;

/**
 *
 * @author wendy
 */
public class TaskList implements List<Task>{
    private ArrayList<Member> taskList;

    public TaskList(){
        taskList = new ArrayList<>();
    }    
    @Override
    public boolean insert(Task obj) {
        if (obj != null) {
            return taskList.add(obj);
        }
        return false;
    }

    @Override
    public boolean update(Task obj) {
      if (obj != null && taskList.contains(obj)) {
            int index = taskList.indexOf(obj);
            taskList.set(index, obj);
            return true;
        }
        return false;
    }

    @Override
    public boolean delete(Task obj) {
        return taskList.remove(obj);
    }

    @Override
    public Task search(Object id) {
        if (id instanceof String) {
            for (Task task : taskList) {
                if (task.getId().equals(id)) {
                    return task;
                }
            }
        }
        return null;
    }

    @Override
    public Task[] toArray() {
        return taskList.toArray(new Task[0]);
    }

   
}
