import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDoManager manager = new ToDoManager();

        while (true) {

            System.out.println("\n==== TODO LIST ====");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Task description: ");
                    String description = scanner.nextLine();

                    System.out.print("Category: ");
                    String category = scanner.nextLine();

                    manager.addTask(description, category);

                    System.out.println("Task added.");
                    break;

                case 2:
                    manager.listTasks();
                    break;

                case 3:
                    System.out.println("Bye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}