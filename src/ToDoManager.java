import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ToDoManager {
    private List<Task> tasks;

    public ToDoManager() {
        tasks = new ArrayList<>();
        loadTasks();
    }

    public void addTask(String description, String category) {
        tasks.add(new Task(description, category));
        saveTasks();
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
    
    public void removeTask(int index) {

        if (index < 1 || index > tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        tasks.remove(index - 1);
        saveTasks();
        System.out.println("Task removed.");
    }

    private void loadTasks() {

        try (BufferedReader reader = new BufferedReader(new FileReader("tasks.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split(",");

                if (parts.length == 2) {
                    tasks.add(new Task(parts[0], parts[1]));
                }
            }

        } catch (IOException e) {
            System.out.println("No existing task file found.");
        }
    }

    private void saveTasks() {

        try (PrintWriter writer = new PrintWriter(new FileWriter("tasks.txt"))) {

            for (Task task : tasks) {
                writer.println(task.getDescription() + "," + task.getCategory());
            }

        } catch (IOException e) {
            System.out.println("Error saving tasks.");
        }
    }
}