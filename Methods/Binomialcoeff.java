
public class Binomialcoeff {
    public static int fact  ( int n ){
        int factn = 1;
        for(int i = 1; i<=n ; i++){
            factn = factn*i;
        }
        return factn;

    }
    public static int Binomialcoeff(int n ,int r){
        int n_fact = fact(n );
           int r_fact = fact(r);
           int nmr_fact = fact (n - r);
           int bf = n_fact / (r_fact * nmr_fact);
           return bf;

    }
        public static void main(String [] args){
           
           System.out.println(Binomialcoeff(5, 2));

        
    }
    
}

    

