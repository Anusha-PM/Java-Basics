import java.util.Scanner;
public class Calculator {
    public static void main (String args [] ){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please enter  your number a : ");
        int a = sc.nextInt();
        System.out.print("Please enter  your number b : ");
        int b = sc.nextInt();
        System.out.print("Please enter the operator : ");
        char operator = sc.next().charAt(0);
        switch (operator) {
            case '+' : System.out.println(a+b);
                        break;
            case '-' : System.out.println(a-b);
                        break;
            case '*' : System.out.println(a*b);
                        break;
            case '/' : System.out.println(a/b);
                        break;
            case '%' : System.out.println(a%b);
                        break;                          
                                                           
        }
    }
    
}
