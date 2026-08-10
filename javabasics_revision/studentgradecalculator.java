 import java.util.Scanner;

public class studentgradecalculator{
   


    public static double calculateAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3) / 3.0;
    }

    public static char getGrade(double average) {
        if (average >= 90) {
            return 'A';
        } else if (average >= 75) {
            return 'B';
        } else if (average >= 60) {
            return 'C';
        } else if (average >= 50) {
            return 'D';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        double average = calculateAverage(m1, m2, m3);
        char grade = getGrade(average);

        System.out.println("Average: " + average);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
