import java.util.Scanner;
import java.util.Stack;
import java.net.URI;
public class NavigationApp {
    private Stack<String> backStack;
    private Stack<String> forwardStack;
    private String currentPage;
    public NavigationApp() {
        backStack = new Stack<>();
        forwardStack = new Stack<>();
        currentPage = "Home";
    }
    public void visit(String url) {
        if (currentPage != null) {
            backStack.push(currentPage);
        }
        currentPage = url;
        forwardStack.clear();
        System.out.println("Visited: " + currentPage);
    }
    public void goBack() {
        if (!backStack.isEmpty()) {
            forwardStack.push(currentPage);
            currentPage = backStack.pop();
            System.out.println("Went back to: " + currentPage);
        } else {
            System.out.println("No previous page.");
        }
    }
    public void goForward() {
        if (!forwardStack.isEmpty()) {
            backStack.push(currentPage);
            currentPage = forwardStack.pop();
            System.out.println("Went forward to: " + currentPage);
        } else {
            System.out.println("No next page.");
        }
    }
    public void showCurrentPage() {
        System.out.println("Current page: " + currentPage);
    }
    public static void main(String[] args) {
        NavigationApp nav = new NavigationApp();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\n1. Visit new page");
            System.out.println("2. Go back");
            System.out.println("3. Go forward");
            System.out.println("4. Show current page");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 
            switch (choice) {
                case 1:
                    System.out.print("Enter page URL: ");
                    String url = scanner.nextLine();
                    nav.visit(url);
                    break;
                case 2:
                    nav.goBack();
                    break;
                case 3:
                    nav.goForward();
                    break;
                case 4:
                    nav.showCurrentPage();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
