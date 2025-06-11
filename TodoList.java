import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;

public class TodoList {
    public static void main(String[] args) {
        Queue<String> todoQueue = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n1. Add Task");
            System.out.println("2. View Tasks");
            System.out.println("3. Complete Task");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    String task = sc.nextLine();
                    todoQueue.add(task);
                    System.out.println("Task added successfully!");
                    break;
                case 2:
                    if (todoQueue.isEmpty()) {
                        System.out.println("There are no tasks.");
                    } else {
                        System.out.println("Tasks in the list:");
                        int i = 1;
                        for (String t : todoQueue) {
                            System.out.println(i + ". " + t);
                            i++;
                        }
                    }
                    break;
                case 3:
                    if (todoQueue.isEmpty()) {
                        System.out.println("No tasks to complete.");
                    } else {
                        String completed = todoQueue.poll();
                        System.out.println("Completed task: " + completed);

                    }
                    break;
                default:
                    System.out.println("Exiting the todo list.");            }
        }
        sc.close();
    }
}