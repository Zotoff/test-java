package src;

public class ToDoTask {
    private int id;
    private String name;
    private String description;
    private boolean isCompleted;

    public ToDoTask (int Id, String Name, String Description){
        this.id = Id;

        setName(Name);

        this.description = Description;
        this.isCompleted = false;
    }

    public String getName(){
        return name;
    }

    public void setName(String Name){
        if(Name != null){
            this.name = Name;
        } else {
            System.out.println("Укажите название задачи.");
        }
    }

    public String getDescription(){
        return description;
    }

    // ToDo:
    // 1. Приоритет сделать через Enum
    // 2. Добавить дедлайн
    // 3. Добавить getter'ы остальным полям

}
