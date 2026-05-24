public class Lcm {
    public static int lcm(int a ,int b){
       
        while(b!=0){
            int temp = b;
             b = a%b;
             a = temp;
        }
       
         
     return a;
        
    }
public static void main(String[] args) {
    int a = 12 ;
    int b = 8;
    int lcm =( a*b )/lcm(a,b ); 
    System.out.println(lcm);
}
}
