import java.util.ArrayList;
import java.util.List;

public class TaskService {

    private List<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
        System.out.println("Task added successfully.");
    }

    public void updateTaskStatus(int taskId, TaskStatus status) {
        for (Task task : tasks) {
            if (task.getTaskId() == taskId) {
                task.setStatus(status);
                System.out.println("Task status updated.");
                return;
            }
        }
        System.out.println("Task not found.");
    }

    public void viewAllTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
            return;
        }
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
}
