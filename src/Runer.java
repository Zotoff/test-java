package src;

import src.Entyties.ToDoTask;
import src.Services.DBServices;
import src.Services.InMemoryMenuServices;

import java.sql.*;
import java.util.Properties;

public class Runer {
    public static void main(String arg[]) throws SQLException {

        DBServices services = new DBServices();
        ResultSet rs = services.GetAllTask();
        //PrintResultSet(rs);

        //rs = services.GetTaskById(2);
        //PrintResultSet(rs);

        ToDoTask newTask = new ToDoTask(services.GetMaxId(), "Important Task", null);
        //services.AddTask(newTask);
        //rs = services.GetAllTask();
        //PrintResultSet(rs);

        //rs = services.GetTaskByName(newTask.getName());
        //PrintResultSet(rs);

        newTask = new ToDoTask(8, "task_name_7", "New super description from runner");
        rs = services.GetTaskByName(newTask.getName());
        //services.EditTask(newTask);
        //rs = services.GetTaskByName(newTask.getName());
        PrintResultSet(rs);

        System.out.println();

        //#region Connect Test
        /*
        String user = "postgres";
        String password = "111111";
        String url = "jdbc:postgresql://localhost:5432/todolist";

        DriverManager.registerDriver(new org.postgresql.Driver());
        //Class.forName("org.postgresql.Driver");
        //Properties props = new Properties();
        //props.setProperty("user", "postgres");
        //props.setProperty("password", "111111");
        //props.setProperty("ssl", "true");
        //Connection conn = DriverManager.getConnection(url, props);

        try(Connection connection = DriverManager.getConnection(url, user, password); Statement statement = connection.createStatement()){
            System.out.println("Подключение успешно");

            int id = 1;

            //statement.executeUpdate("INSERT INTO todotask (name, description) VALUES ('some_name', 'description_123')");

            ResultSet rs = statement.executeQuery("select * from todotask where task_id = '" + id + "'");


            id = 2;
            PreparedStatement ps = connection.prepareStatement("select * from todotask where task_id = ? ");
            ps.setInt(1, id);
            ResultSet rs2 = ps.executeQuery();

            while (rs.next()){
                System.out.println(rs.getInt("task_id"));
                System.out.println(rs.getString("name"));
                System.out.println("--------");
            }

            while (rs2.next()){
                System.out.println(rs2.getInt("task_id"));
                System.out.println(rs2.getString("name"));
                System.out.println("--------");
            }
        }

         */
        //#endregion

        //#region Memory Test
        //InMemoryMenuServices menu = new InMemoryMenuServices();
        //menu.showTasks();
        //menu.addToDoTask(new ToDoTask(7, "New Name 7", "Sometimes"));
        //menu.showTasks();
        //menu.removeToDoTask();
        //#endregion
    }

    public static void PrintResultSet(ResultSet rs) throws SQLException {
        while (rs.next()){
            System.out.println(rs.getInt("task_id"));
            System.out.println(rs.getString("name"));
            System.out.println(rs.getString("description"));
            System.out.println(rs.getBoolean("is_completed"));
            System.out.println("--------");
        }
    }
}
