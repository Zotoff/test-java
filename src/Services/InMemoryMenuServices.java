package src.Services;

import src.Entyties.ToDoTask;
import src.interfaces.MenuServices;

import java.util.ArrayList;
import java.util.List;

public class InMemoryMenuServices implements MenuServices {

    private List<ToDoTask> tasksList;
    public InMemoryMenuServices(){
        tasksList = new ArrayList<ToDoTask>();

        tasksList.add(new ToDoTask(1,"Name1","Description1"));
        tasksList.add(new ToDoTask(2,"Name2","Description2"));
        tasksList.add(new ToDoTask(3,"Name3","Description3"));
        tasksList.add(new ToDoTask(4,"Name4","Description4"));
        tasksList.add(new ToDoTask(5,"Name5","Description5"));
    }

    @Override
    public void addToDoTask(ToDoTask toDoTask) {
        tasksList.add(toDoTask);
    }

    // Нужно дергать по id, для этого найти его в листе
    @Override
    public void removeToDoTask(ToDoTask toDoTask) {
        tasksList.remove(toDoTask);
    }
    
    public void showTasks(){
        for (ToDoTask task : tasksList) {
            System.out.println(task.getName());
        }
    }
    
}
