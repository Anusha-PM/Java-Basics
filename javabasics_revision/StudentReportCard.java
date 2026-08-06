import java.util.Scanner;

public class StudentReportCard {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== STUDENT REPORT CARD =====");

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter Marks for Subject " + i + ": ");
            total += sc.nextDouble();
        }

        double percentage = total / 5;

        System.out.println("\n===== RESULT =====");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Percentage : " + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade : A");
        } else if (percentage >= 75) {
            System.out.println("Grade : B");
        } else if (percentage >= 60) {
            System.out.println("Grade : C");
        } else if (percentage >= 35) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }

        if (percentage >= 35) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }

        sc.close();
    }
}