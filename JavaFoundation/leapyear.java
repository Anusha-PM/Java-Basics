public class leapyear {
    public static void leapyear (int n){
        int org = n;
        if ( (n%4==0 && n%100!=0) || (n%400==0)) {
            System.out.println(org+ ":" +"Leap Year");

        }
        else{
            System.out.println(org+":"+"Not a Leap Year");
        }

    }
    public static void main(String[] args) {
        leapyear(2003);
    }
    
}
