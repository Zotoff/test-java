package src.interfaces;

import src.Entyties.ToDoTask;

public interface MenuServices {
    // Добавить задачу
    void addToDoTask(ToDoTask toDoTask);

    // Удалить задачу
    void removeToDoTask(ToDoTask toDoTask);

}
