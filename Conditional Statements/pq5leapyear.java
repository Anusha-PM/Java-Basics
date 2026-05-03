import java.util.Scanner;
public class pq5leapyear {
    
    public static void main (String args [] ){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please Enter your year : ");
        int year = sc.nextInt();

        if (((year % 4 == 0 ) && (year % 100 != 0  )) || (year % 400 == 0)) {
            System.out.print("Your entered year is a leap year ");
        }
        
        else { 
            System.out.println("Your entered year is not a leap year");
        }
        }

    }
    
    

