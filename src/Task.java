package src;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class Task {
   private String taskName;
   private String taskDescription;
   public Task(String taskName,String taskDescription){
       this.taskName=taskName;
       this.taskDescription=taskDescription;
   }

    public String getTaskName() {
        return taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    @Override
    public String toString() {
        return "TaskName"+taskName+"TaskDescription"+taskDescription;
    }
}
class TaskManagementApp {
    private List<Task> taskList;

    public TaskManagementApp() {
        taskList = new LinkedList<>();
    }

    public void addTask(Task task) {
        taskList.add(task);
    }

    public void removeTask(String taskName) {
        Task taskToRemove = null;
        for (Task task : taskList) {
            if (task.getTaskName().equals(taskName)) {
                taskToRemove = task;
                break;
            }
        }
        if (taskToRemove != null) {
            taskList.remove(taskToRemove);
        } else {
            System.out.println("Task with name '" + taskName + "' not found.");
        }
    }

    public void displayTask() {
        System.out.println("Task List:");
        for (Task task : taskList) {
            System.out.println("Task List:");
        }
        System.out.println();
    }

    public void moveTaskToTop(String taskName) {
        Task taskToMove = null;
        for (Task task : taskList) {
            if (task.getTaskName().equals(taskName)) {
                taskToMove = task;
                break;
            }
        }
        if (taskToMove != null) {
            taskList.remove(taskToMove); // Remove from current position
            taskList.addFirst(taskToMove); // Add to the beginning of the list
        } else {
            System.out.println("Task with name '" + taskName + "' not found.");
        }
    }

    public static void main(String[] args) {
        TaskManagementApp app = new TaskManagementApp();
        app.addTask(new Task("Task 1", "Description"));
        app.addTask(new Task("Task 2", "Description"));
        app.addTask(new Task("Task 3", "Description"));
        System.out.println("Initial Task List:");
        app.displayTask();
        app.removeTask("Task 2");
        System.out.println("After removing 'Task 2':");
        app.displayTask();
        app.moveTaskToTop("Task 3");
        System.out.println("After moving 'Task 3' to top:");
        app.displayTask();
    }
}