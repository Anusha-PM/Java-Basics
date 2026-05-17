import java.util.Scanner;

public class productab {

public static int product(int a,int b){
    int product = a * b;
    return product;
}
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print(" Please enter a : ");
            int a = sc.nextInt();
        System.out.print(" Please enter b : ");
            int b = sc.nextInt();

        int product = product(a, b);
        System.out.println("Product is  = " + product );
        

    }
    
}
