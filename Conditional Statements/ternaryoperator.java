import java.util.Scanner;
public class ternaryoperator {
    public static void main (String args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your marks: ");
        int marks = sc.nextInt();

    String result = (marks>=33)? ("pass") : ("fail") ;
    System.out.println(" Result :  " + result);

    }
    
}
