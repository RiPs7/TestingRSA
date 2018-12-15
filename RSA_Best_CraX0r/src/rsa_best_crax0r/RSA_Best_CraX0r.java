package rsa_best_crax0r;

public class RSA_Best_CraX0r {
    
    static int p = 4327;
    static int q = 5437;
    static int n = p * q;

    public static void main(String[] args) {
         
        CraX0r crax0r = new CraX0r(n);
        
        Candidate c = crax0r.crack();
        
    }
    
}
