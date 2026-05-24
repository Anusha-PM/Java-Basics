<<<<<<< HEAD
import java.util.Scanner;
public class prime {
  public static void main (String args [] ){
    Scanner sc = new Scanner ( System.in);
    System.out.print(" Please enter your number : ");
    int num = sc.nextInt();

    if(num == 2) {
        System.out.println(num + "  is a prime number ");
    }
    else {
        boolean isPrime = true;
        //for (int i =2 ; i < num -1 ; i ++){          // here loops run for (n-2) terms  
        for (int i = 2 ; i <= Math.sqrt(num); i ++){  //optimized version here loop runs sqrt(num )  times 
            if (num % i == 0){
                isPrime = false;
            }
        }
        if (isPrime == true ) {
           System.out.println(num + " is a prime number ");
          
        } 
        else {
            System.out.println(num + " is not a prime  number ");
        
    }
}
  }  
}
=======
import java.util.Scanner;
public class prime {
  public static void main (String args [] ){
    Scanner sc = new Scanner ( System.in);
    System.out.print(" Please enter your number : ");
    int num = sc.nextInt();

    if(num == 2) {
        System.out.println(num + "  is a prime number ");
    }
    else {
        boolean isPrime = true;
        //for (int i =2 ; i < num -1 ; i ++){          // here loops run for (n-2) terms  
        for (int i = 2 ; i <= Math.sqrt(num); i ++){  //optimized version here loop runs sqrt(num )  times 
            if (num % i == 0){
                isPrime = false;
            }
        }
        if (isPrime == true ) {
           System.out.println(num + " is a prime number ");
          
        } 
        else {
            System.out.println(num + " is not a prime  number ");
        
    }
}
  }  
}
>>>>>>> e19e6f06d299aa5ee26958d4bf0132b539df7102
