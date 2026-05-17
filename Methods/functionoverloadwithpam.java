package Functions.Methods;

public class functionoverloadwithpam {

    public static int sum2 (int a , int b){
        return a+b;
    }
    public static int sum2 (int a , int b, int c){
        return a+b+c;
    }

    public static void main (String [] args){
        System.out.println(sum2(5, 2));
        System.out.println(sum2(5, 1,2));
    }

    
}
