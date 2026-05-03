import java.util.*;
public class oddeven2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print(" Please Enter Your Number : ");
        int num = sc.nextInt();
        if(num%2 == 0 ) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is Odd");

        }

        
    }
    
}
