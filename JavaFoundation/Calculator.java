import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter a operand: ");
        int a = sc.nextInt();
        System.out.print("Please enter the operator: ");
        char operand = sc.next().charAt(0);
        System.out.print("Please enter b operand: ");
        int b = sc.nextInt();

        switch(operand){
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            default: System.out.println("Invalid input");

        }
        }
    }
    

