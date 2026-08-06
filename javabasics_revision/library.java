import java.util.Scanner;

public class library {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int availableBooks = 20;
        int totalBooks = 20;
        int choice;

        do {

            System.out.println("\n========== LIBRARY MENU ==========");
            System.out.println("1. View Available Books");
            System.out.println("2. Borrow Books");
            System.out.println("3. Return Books");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Available Books: " + availableBooks);
                    break;

                case 2:
                    System.out.print("How many books do you want to borrow? ");
                    int borrow = sc.nextInt();

                    if (borrow <= 0) {
                        System.out.println("❌ Invalid number of books.");
                    } else if (borrow > availableBooks) {
                        System.out.println("❌ Not enough books available.");
                    } else {
                        availableBooks -= borrow;
                        System.out.println("✅ Books borrowed successfully!");
                        System.out.println("Available Books: " + availableBooks);
                        System.out.println("📚 Please return the books before the due date.");
                    }
                    break;

                case 3:
                    System.out.print("How many books do you want to return? ");
                    int returned = sc.nextInt();

                    if (returned <= 0) {
                        System.out.println("❌ Invalid number of books.");
                    } else if (availableBooks + returned > totalBooks) {
                        System.out.println("❌ Invalid return. Returned books exceed library capacity.");
                    } else {
                        availableBooks += returned;
                        System.out.println("✅ Books returned successfully!");
                        System.out.println("Available Books: " + availableBooks);
                        System.out.println("😊 Thank you for returning the books!");
                    }
                    break;

                case 4:
                    System.out.println("\n📖 Thank you for visiting the library!");
                    System.out.println("Available Books: " + availableBooks);
                    break;

                default:
                    System.out.println("❌ Invalid choice. Please try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}