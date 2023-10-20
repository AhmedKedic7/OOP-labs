package org.example.lab3;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


    public class DbConnect {
        private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
        private static final String USERNAME = "root";
        private static final String PASSWORD = "rootroot";


        private Connection connection = null;


        public DbConnect() throws RuntimeException {
            try {
                connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
        public List<TaskItem> printTasksFromDatabase(){
            List<TaskItem> tasks= new ArrayList<>();
            String query = "SELECT id, task_description, task_status FROM tasks";
            try(PreparedStatement statement = connection.prepareStatement(query);
                ResultSet resultSet = statement.executeQuery()){
                while(resultSet.next()) {
                    int taskId = resultSet.getInt("id");
                    String taskDescription = resultSet.getString("task_description");
                    TaskStatus taskStatus = TaskStatus.valueOf((resultSet.getString("task_status")));
                    TaskItem task= new TaskItem(taskId,taskDescription,taskStatus);
                    tasks.add(task);

                }

            }catch (SQLException e){
                e.printStackTrace();
            }
            return tasks;
        }
        public TaskItem getTaskByIdFromDatabase(int taskId) {
            String query = "SELECT id, task_description, task_status FROM tasks WHERE id = ?";
            try (PreparedStatement statement = connection.prepareStatement(query)) {
                statement.setInt(1, taskId);
                ResultSet resultSet = statement.executeQuery();
                if (resultSet.next()) {
                    String taskDescription = resultSet.getString("task_description");
                    TaskStatus taskStatus = TaskStatus.valueOf(resultSet.getString("task_status"));
                    return new TaskItem(taskId, taskDescription, taskStatus);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return null;
        }
        public static void main(String[] args) {
            DbConnect dbConnect = new DbConnect();

           // Fetch all task entities from the database.
            List<TaskItem> allTasks = dbConnect.printTasksFromDatabase();
            System.out.println("All tasks:");
            allTasks.forEach(task -> System.out.println(task.getTaskDescription()));

            // Fetch a specific task entity by its ID.
            int taskIdToFetch = 2;
            TaskItem specificTask = dbConnect.getTaskByIdFromDatabase(taskIdToFetch);
            if (specificTask != null) {
                System.out.println("\nTask with ID " + taskIdToFetch + ": " + specificTask.getTaskDescription());
            } else {
                System.out.println("\nTask with ID " + taskIdToFetch + " not found.");
            }
        }
    }


