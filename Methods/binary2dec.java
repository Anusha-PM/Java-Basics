
public class binary2dec {
    
    public static void binary2decimal(int n){
        int mynumber = n;
        int dec = 0;
        int pow = 0;
        while(n>0){
        
        int LD = n%10;
        dec = dec + LD *(int) Math.pow(2,pow);
        
        n/=10;
        pow++;
    }
    System.out.println(" Decimal number of a " +  mynumber  + ":" + dec);
    
}
public static void main(String[] args) {
    binary2decimal(101);

    
}

}
