// <<<<<<< HEAD
// import java.util.Scanner;
// public class fact {
//     public static void main(String [] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print(" Please enter your number :  ");
//         int num = sc.nextInt();

//        int  fact = 1;
//        for (int i = 1 ;i <= num ; i ++){
        
//         fact = fact * i;
//        }
//        System.out.println(" Factorial of a number : " + fact );

//     }
    
// }
// =======
import java.util.Scanner;
public class fact {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your number :  ");
        int num = sc.nextInt();

       int  fact = 1;
       for (int i = 1 ;i <= num ; i ++){
        
        fact = fact * i;
       }
       System.out.println(" Factorial of a number : " + fact );

    }
    
}

