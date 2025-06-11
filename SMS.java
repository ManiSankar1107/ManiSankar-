import java.util.*;

public class SMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine();  
        String[] arr = new String[n];
        float[] attendance = new float[n];
        int[] admission = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Name: ");
            arr[i] = sc.nextLine();
            System.out.print("Attendance: ");
            attendance[i] = sc.nextFloat();
            System.out.print("Admission Number: ");
            admission[i] = sc.nextInt();
            sc.nextLine();  
        }
        System.out.println("\nEnter the requirement: 1 for admission number, 2 for name, 3 for attendance");
        int choice = sc.nextInt();
        sc.nextLine();  
        switch (choice) {
            case 1:
                System.out.print("Enter the admission number: ");
                int adm = sc.nextInt();
                int index = -1;
                for (int i = 0; i < admission.length; i++) {
                    if (admission[i] == adm) {
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    System.out.println("Name: " + arr[index]);
                    System.out.println("Attendance: " + attendance[index]);
                } else {
                    System.out.println("Admission number not found.");
                }
                break;
            case 2:
                System.out.print("Enter the name: ");
                String name = sc.nextLine();
                index = -1;
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i].equalsIgnoreCase(name)) {  
                        index = i;
                        break;
                    }
                }
                if (index != -1) {
                    System.out.println("Admission Number: " + admission[index]);
                    System.out.println("Attendance: " + attendance[index]);
                } else {
                    System.out.println("Name not found.");
                }
                break;
            case 3:
                System.out.print("Enter the attendance percentage: ");
                float att = sc.nextFloat();
                boolean found = false;
                for (int i = 0; i < attendance.length; i++) {
                    if (attendance[i] == att) {
                        found = true;
                        System.out.println("Name: " + arr[i]);
                        System.out.println("Admission Number: " + admission[i]);
                    }
                }
                if (!found) {
                    System.out.println("No student with that attendance percentage.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }
        sc.close();
    }
}