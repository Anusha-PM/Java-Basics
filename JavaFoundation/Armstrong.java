public class Armstrong {
    public static void armstrong(int n) {
        int sum = 0;
        int original = n;
        while(n>0){
             int digit = n%10;
              int prd = digit*digit*digit;
             sum = sum + prd ;
             n/=10;
}
if(sum == original ){
    System.out.println(original + ":"+ " Armstrong number");
}
else{
    System.out.println(original + ":"+ "Not a Armstrong number");
}

        
    }

    public static void main(String[] args) {
        armstrong(123);
    }    
}