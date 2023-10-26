package lab3.lab3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1, "Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2, "Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3, "Go over tasks from lab2", TaskStatus.COMPLETED));
    }

    public List<TaskItem> getTasks() {
        return tasks;
    }
    // TODO create a method getByStatuts that will accept a Status parameter and filter the tasks with the provided status
    public List<TaskItem> getByStatus(TaskStatus Status){
        return tasks.stream()
                .filter(task -> task.getTaskStatus().equals(Status))
                .collect(Collectors.toList());
    }
    // TODO create a method to find tasks whose id parameter greater than or equal to 2
    public List<TaskItem> getTaskIdGreaterThan2OrEqual(){

        return tasks.stream()
                .filter(task-> task.getTaskId() >= 2)
                .collect(Collectors.toList());

    }
    //TODO create a method that will, by using the forEach stream method, print to the console the description of each task
    public void printTaskDescription(List<TaskItem> tasksToPrint) {
        (tasksToPrint == null ? tasks.stream() : tasksToPrint.stream())
                .forEach(task -> System.out.println(task.getTaskDescription()));
    }

    public static void main(String[] args) {
        DataStructures dataStructures = new DataStructures();

        List<TaskItem> allTasks = dataStructures.getTasks();
        System.out.println("All tasks:");
        dataStructures.printTaskDescription(null);

        TaskStatus statusToFind = TaskStatus.IN_PROGRESS;
        List<TaskItem> tasksByStatus = dataStructures.getByStatus(statusToFind);
        System.out.println("\nTasks with status " + statusToFind + ":");
        dataStructures.printTaskDescription(tasksByStatus);


        List<TaskItem> tasksById = dataStructures.getTaskIdGreaterThan2OrEqual();
        System.out.println("\nTasks with ID greater than or equal to 2:");
        dataStructures.printTaskDescription(tasksById);
    }
}


