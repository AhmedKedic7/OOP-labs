package org.example.lab3;
enum TaskStatus{
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED

}

public class TaskItem{

    private int taskId;
    private String taskDescription;


    private TaskStatus taskStatus;

    public TaskItem(int taskId,String taskDescription,TaskStatus taskStatus){
        this.taskId=taskId;
        this.taskDescription=taskDescription;
        this.taskStatus=taskStatus;

    }
    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public int getTaskId() {
        return taskId;
    }

    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }
    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus;
    }
    public static void main(String[] args) {

    }





}
