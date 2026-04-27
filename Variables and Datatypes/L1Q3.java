import java.util.*;
public class L1Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the pencil amount : ");
        float pencil = sc.nextFloat();
         System.out.print("Please enter the pen amount : ");
        float pen = sc.nextFloat();
         System.out.print("Please enter the eraser amount : ");
        float eraser = sc.nextFloat();
        float total = pencil+pen+eraser;
        System.out.print("Total cost is : " + total +"\n");
        double gst = total * (0.18f);
        System.out.print("Final price including gst is : " + gst);
    
    }
    
}
