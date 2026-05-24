public class hollowrhombus {
    public static void hollowrhombus(int totrow, int totcoln ){
        for(int i = 1; i <= totrow ; i++){
            for(int j = 1; j <= (totrow-i); j++){
                System.out.print(" ");
            }
            for(int j =1; j <=totcoln ; j++){
                if(i==1||i==4||j==1||j==5){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollowrhombus(4,5);
    }
    
}
