<<<<<<< HEAD


public class reversenumber {
    public static void main ( String [] args){
        int n = 10899;
        int reverse = 0;

        while(n>0){
            int lastdigit = n % 10;
            reverse = reverse *10 +lastdigit;
            
            n = n/10;
        }
        System.out.print(reverse + " ");

    }
    
}
=======


public class reversenumber {
    public static void main ( String [] args){
        int n = 10899;
        int reverse = 0;

        while(n>0){
            int lastdigit = n % 10;
            reverse = reverse *10 +lastdigit;
            
            n = n/10;
        }
        System.out.print(reverse + " ");

    }
    
}
>>>>>>> e19e6f06d299aa5ee26958d4bf0132b539df7102
