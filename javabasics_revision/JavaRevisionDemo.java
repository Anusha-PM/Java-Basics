import java.util.Scanner;

public class JavaRevisionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== JAVA REVISION DEMO =====");

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // if-else
        if (age >= 18) {
            System.out.println("Eligible to Vote");
        } else {
            System.out.println("Not Eligible to Vote");
        }

        // else-if
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 35) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        // for loop
        System.out.println("\nNumbers from 1 to 5:");

        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }

        // while loop
        int count = 5;

        System.out.println("\n\nCountdown:");

        while (count >= 1) {
            System.out.print(count + " ");
            count--;
        }

        // do-while
        int choice = 1;

        System.out.println("\n\nDo-While Demo:");

        do {
            System.out.println("Executed Once");
            choice++;
        } while (choice == 1);

        sc.close();
    }
}