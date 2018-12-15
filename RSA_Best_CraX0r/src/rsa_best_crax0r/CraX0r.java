package rsa_best_crax0r;

import java.util.Stack;

public class CraX0r {
    
    int n;
    
    public CraX0r(int n){
        this.n = n;
    }
    
    public Candidate crack(){
        return this.crack(this.n);
    }
    
    public Candidate crack(int n){
        int digitLimit = (int)Math.ceil(Math.log10((Math.sqrt(n))));
        
        Stack<Candidate> stack = new Stack();
        
        //while 
        
        return null;
    }
    
}
