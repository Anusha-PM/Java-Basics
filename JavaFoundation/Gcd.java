// public class Gcd {
//     public static int gcd(int a ,int b){
       
//         while(a!=b){
//             if(a>b){
//                a = a - b;
//             }
//             else 
//                b = b - a ;
//         }
//     return a;
        
//     }

//     public static void main(String [] args){
//         System.out.println( gcd(8,6));
//     }
    
// }

// This is the more simpler method

public class Gcd{
    public static int gcd(int a,int b){
        while(b!=0){
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
     public static void main(String [] args){
        System.out.println( gcd(8,6));
    }
    
}