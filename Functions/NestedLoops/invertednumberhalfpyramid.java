package Nestedloop;

public class invertednumberhalfpyramid {
    public static void halfpyramidwithnumber(int n) {
        int num = 1;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1; j <= i; j++){
                System.err.print( j + " ");
            }
            System.out.println();
            num++;
        }
    }

    public static void main(String[] args) {
        halfpyramidwithnumber(5);
    }
    
}
