package Models.Task;

import Models.Entity;
import Models.Members.Member;

/**
 * @author abiga
 */
public class Task implements Entity {
   private int num;
   private String name;
   private String descripcion;
   private String startDate;
   private String endDate;
   private boolean completed;
   private Member responsible;

    public Task(int num, String name, String descripcion, String startDate, String endDate, Member responsible) {
        this.num = num;
        this.name = name;
        this.descripcion = descripcion;
        this.startDate = startDate;
        this.endDate = endDate;
        this.responsible = responsible;
        this.completed = false;
    }
    
    public Task(int num, String name, String descripcion, String startDate, String endDate) {
        this(num,name,descripcion,startDate,endDate,null);
    }

    public Task(int num) {
        this(num,"","","","",null);
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getStartDate() {
        return startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public boolean isCompleted() {
        return completed;
    }

    public Member getResponsible() {
        return responsible;
    }

    public void setResponsible(Member responsible) {
        this.responsible = responsible;
    }
    public void complete() {
    completed = true;
    }

   
   
    @Override
    public boolean isComplete() {
    return num != 0 && name != null && !name.equals("") && descripcion != null && !descripcion.equals("") &&
           startDate != null && !startDate.equals("") && endDate != null && !endDate.equals("");
      }

    @Override
    public Object[] toArrayObject() {
    return new Object[]{this.num, this.name, this.descripcion, this.startDate, this.endDate, this.completed, this.responsible};
}

    }


    