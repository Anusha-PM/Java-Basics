public class prime {
    public static boolean isPrime(int num){
        boolean isPrime = true;

        if(num == 2){
            return true;
        }
 
       // for(int i =2; i <= num-1 ;i++){    normal 
       // next condition is optimized to reduce computation

       for(int i = 2; i <= Math.sqrt(num);i++){

            if(num%i ==0){
                isPrime = false;
            }
            
    }

    return isPrime;
 }

 public static void main (String [] args){
    System.err.println(isPrime(22));
 }
    }
