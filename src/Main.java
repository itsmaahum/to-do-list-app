import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ToDoManager manager = new ToDoManager();

        while (true) {

            System.out.println("\n==== TODO LIST ====");
            System.out.println("1. Add Task");
            System.out.println("2. List Tasks");
            System.out.println("3. Remove Task");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {

                case 1: //add
                    System.out.print("Task description: ");
                    String description = scanner.nextLine();

                    System.out.print("Category: ");
                    String category = scanner.nextLine();

                    manager.addTask(description, category);

                    System.out.println("Task added.");
                    break;

                case 2: //list
                    manager.listTasks();
                    break;

                case 3: //remove 
                    manager.listTasks();

                    System.out.print("Enter task number to remove: ");
                    int taskNumber = scanner.nextInt();
                    scanner.nextLine();

                    manager.removeTask(taskNumber);
                    break;

                case 4: //exit
                    System.out.println("Bye!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}