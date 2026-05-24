public class Fibonacci {
    public static void fibonacci(int n){
        int a = 0;
        int b = 1;
        int nextno = b;
        System.out.print(a+" " + b);
        int i = 2;
        while(i<n){
            System.out.print(" " + nextno + " ");
            nextno = a+b;
            a=b;
            b=nextno;

            i++;
        }
    }

    public static void main ( String [] args){
        fibonacci(10);
    }
    
}
