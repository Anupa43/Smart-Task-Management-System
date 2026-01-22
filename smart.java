public class Main {
    public static void main(String[] args) {

        TaskService service = new TaskService();

        Task task1 = new Task(1, "Design Login Module", "Alice", Priority.HIGH);
        Task task2 = new Task(2, "Write API Tests", "Bob", Priority.MEDIUM);

        service.addTask(task1);
        service.addTask(task2);

        service.viewAllTasks();

        service.updateTaskStatus(1, TaskStatus.IN_PROGRESS);
        service.updateTaskStatus(2, TaskStatus.COMPLETED);

        System.out.println("\nAfter Status Updates:");
        service.viewAllTasks();
    }
}
