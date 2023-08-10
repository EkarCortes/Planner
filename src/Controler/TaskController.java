package Controler;

import View.View;



public class TaskController implements Controler<Task> {
    private TaskList taskList; //FALTA PARTE ALE
   private View view;

    public TaskController(View view) {
        taskList = TaskList.getInstance(); //FALTA PARTE ALE
        this.view = view;
    }

    @Override
    public void insert(Task task) {
        if (task.isComplete()) {
            taskList.insert(task);
            this.readAll();
        } else {
            view.displayErrorMessaje("Datos de la tarea inválidos. Tarea no agregada.");
        }
    }

    @Override
    public void update(Task task) {
        if (task.isComplete()) {
            taskList.update(task);
            this.readAll();
        } else {
            view.displayErrorMessaje("Datos de la tarea inválidos. Tarea no actualizada.");
        }
    }

    @Override
    public void delete(Task task) {
        if (taskList.delete(task)) {
            this.readAll();
        } else {
            view.displayErrorMessaje("Tarea no encontrada en la lista. No se puede eliminar.");
        }
    }

    @Override
    public void read(Object id) {
        Task task = taskList.search(id);
        if (task != null) {
            view.display(task);
        } else {
            view.displayErrorMessaje("Tarea con el ID proporcionado no encontrada.");
        }
    }

    @Override
    public void readAll() {
        Task[] tasks = taskList.toArray();
        if (tasks.length > 0) {
            view.displayAll(tasks);
        }
    }
}
