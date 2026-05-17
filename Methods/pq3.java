public class pq3 {
    public static void palindrome(int n){
        int original = n;
        int rev = 0;
        while(n>0){
            int ld = n % 10;
            rev = rev *10 +ld ;
            n/=10;
            }
            System.out.println(rev);
    

    if(original == rev ){
        System.out.println( original + " is a palindrome number");
    }
    
        else{
            System.out.println(original + " is not a palindrome" );
            
            }
}
public static void main (String [] args){
    palindrome(151);
    
}
}
    
    

