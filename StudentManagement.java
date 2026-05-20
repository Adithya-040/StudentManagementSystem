import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[100];
        int[] marks = new int[100];

        int count = 0;
        int choice;

        do {

            System.out.println("\n=== Student Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter student name: ");
                    names[count] = sc.nextLine();

                    System.out.print("Enter marks: ");
                    marks[count] = sc.nextInt();

                    count++;

                    System.out.println("Student added successfully!");
                    break;

                case 2:

                    System.out.println("\n--- Student Records ---");

                    for(int i = 0; i < count; i++) {

                        System.out.println(
                            "Name: " + names[i] +
                            " | Marks: " + marks[i]
                        );
                    }

                    break;

                case 3:

                    System.out.println("Exiting program...");
                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while(choice != 3);

        sc.close();
    }
}