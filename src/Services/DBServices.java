package src.Services;

import src.Entyties.ToDoTask;

import java.sql.*;

public class DBServices  {

    // ToDo Перенести получение настроек из xml/json
    private final String user = "postgres";
    private final String password = "111111";
    private final String url = "jdbc:postgresql://localhost:5432/todolist";


    public void AddTask(ToDoTask newTask) throws SQLException {

        DriverManager.registerDriver(new org.postgresql.Driver());

        String sql = "INSERT INTO todotask (name, description) VALUES (?, ?)";

        try(Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()){

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, newTask.getName());
            ps.setString(2, newTask.getDescription());
            ps.executeUpdate();
        }
    }
    // update
    public void EditTask(ToDoTask task) throws SQLException {

        DriverManager.registerDriver(new org.postgresql.Driver());

        String sql = "UPDATE todotask SET description = '" + task.getDescription() + "' WHERE name = '" + task.getName() + "'";

        try(Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()){
            //statement.executeQuery(sql);
            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, task.getDescription());
            ps.setString(2, task.getName());
            //PreparedStatement ps = connection.prepareStatement(sql);
            ps.execute();
        }
    }
    // delete

    public ResultSet GetTaskByName(String name) throws SQLException {

        DriverManager.registerDriver(new org.postgresql.Driver());

        String sql = "SELECT * FROM todotask WHERE name = ?";
        ResultSet rs;

        try(Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()){

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setString(1, name);
            rs = ps.executeQuery();
        }
        return rs;
    }

    public int GetMaxId() throws SQLException {

        DriverManager.registerDriver(new org.postgresql.Driver());

        String sql = "SELECT MAX(task_id) FROM todotask";
        int result = 0;

        try(Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()){

            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                result = rs.getInt(1);
                break;
            }
        }
        return result;
    }

    public ResultSet GetTaskById(int id) throws SQLException {

        DriverManager.registerDriver(new org.postgresql.Driver());

        String sql = "SELECT * FROM todotask WHERE task_id = ?";
        ResultSet rs;

        try(Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()){

            PreparedStatement ps = connection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
        }
        return rs;
    }

    public ResultSet GetAllTask() throws SQLException {

        DriverManager.registerDriver(new org.postgresql.Driver());

        String sql = "SELECT * FROM todotask";
        ResultSet rs;

        try(Connection connection = DriverManager.getConnection(url, user, password);
            Statement statement = connection.createStatement()){

            PreparedStatement ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
        }
        return rs;
    }

    public void SomeMethode() throws SQLException {



        try(Connection connection = DriverManager.getConnection(url, user, password);
                Statement statement = connection.createStatement()){

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
    }


}
