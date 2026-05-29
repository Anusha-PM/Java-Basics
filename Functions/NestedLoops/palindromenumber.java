

public class palindromenumber {
    public static void palindrome(int n ){
        for(int i = 1; i <= n ; i++){
            for(int j = 1; j <= (n-i); j++){
                System.out.print(" ");
            }
            //descending i to 1
            for(int j = i ; j>= 1; j --){
                System.out.print(j);
            }
            //ascending 2 to i
            for(int j = 2; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        palindrome(5);
    }
    
}
