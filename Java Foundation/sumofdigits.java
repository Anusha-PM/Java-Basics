public class sumofdigits {

    public static int sumofdigits(int n){
        int sum = 0;
        while(n>0){
        int LD = n % 10;
        sum = sum + LD;
        n/=10;
          }

    return sum;

    }

    public static void main (String args [] ) {
        int sum = sumofdigits(7544);
        System.out.println("Sum of digits of n : " + sum );
    }
    
}
