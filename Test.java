import java.time.LocalDate;

public class Task {
    private int taskId;
    private String title;
    private String assignedTo;
    private Priority priority;
    private TaskStatus status;
    private LocalDate createdDate;

    public Task(int taskId, String title, String assignedTo, Priority priority) {
        this.taskId = taskId;
        this.title = title;
        this.assignedTo = assignedTo;
        this.priority = priority;
        this.status = TaskStatus.OPEN;
        this.createdDate = LocalDate.now();
    }

    public int getTaskId() {
        return taskId;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public String toString() {
        return "Task ID: " + taskId +
                ", Title: " + title +
                ", Assigned To: " + assignedTo +
                ", Priority: " + priority +
                ", Status: " + status +
                ", Created On: " + createdDate;
    }
}
