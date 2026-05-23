import java.util.Scanner;
public class aq2 {
    public static void main(String [] args) {
        Scanner input = new Scanner (System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print(" How many values u need to give : ");
        int val = sc.nextInt();
        int evensum = 0;
        int oddsum = 0;


       
        for(int i = 1; i <= val ; i++){
             System.out.print(" Enter the values: " + " ");
            int num = sc.nextInt();
            if(num%2 ==0 ){
            evensum = evensum + num;
            }
            else{
            oddsum = oddsum + num;
            }

        }
        System.out.println(" Total even sum = " + evensum);
        System.out.println(" Total odd sum = " + oddsum);
        

        
    }
    
}
