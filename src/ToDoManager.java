import java.util.ArrayList;
import java.util.List;

public class ToDoManager {
    private List<Task> tasks;

    public ToDoManager() {
        tasks = new ArrayList<>();
    }

    public void addTask(String description, String category) {
        tasks.add(new Task(description, category));
    }

    public void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks found.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }
}