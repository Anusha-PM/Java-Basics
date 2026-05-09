import java.util.Scanner;
public class multiply {
    public static void main(String arge[] ){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter your number: ");
        int num = sc.nextInt();
    
    int multiply = 1;
    for(int i = 1; i<=10 ; i++){
       multiply = num * i ;
       System.out.println(num + "*" + i + "=" +multiply);

    }
    
}}
