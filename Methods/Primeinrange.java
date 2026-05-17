public class Primeinrange {


    public static boolean isPrime (int n){
    if(n==2){
        return true;
    }
    for(int i = 2;i <= Math.sqrt(n);i++){
        if(n%10 == 0){
            return false;
        }
    }
    return true;

    }


    public static void Primeinrange(int n) {
        for(int i =2;i <= 10 ;i++){
            isPrime(i);
                
            System.out.println(i + "  ");
        }}
        
    

    public static void main(String[] args) {
        Primeinrange(20);
    }
     
       
        
    
    
}
