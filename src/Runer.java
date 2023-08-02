package src;

import src.Entyties.ToDoTask;
import src.Services.InMemoryMenuServices;

public class Runer {
    public static void main(String arg[]) {

        InMemoryMenuServices menu = new InMemoryMenuServices();

        //menu.showTasks();

        menu.addToDoTask(new ToDoTask(7, "New Name 7", "Sometimes"));

        menu.showTasks();

        //menu.removeToDoTask();
    }

}
