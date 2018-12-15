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
        
        int digits = 1;
        int lastPart = n % ((int)Math.pow(10, digits));
        if (lastPart == 1) {
            stack.push(new Candidate(1, 1, 0));
            stack.push(new Candidate(9, 9, 8));
        } else if (lastPart % 3 == 0) {
            stack.push(new Candidate(1, 3, 0));
            stack.push(new Candidate(7, 9, 6));
        } else if (lastPart % 7 == 0) {
            stack.push(new Candidate(1, 7, 0));
            stack.push(new Candidate(3, 9, 2));
        } else if (lastPart % 9 == 0) {
            stack.push(new Candidate(1, 9, 0));
            stack.push(new Candidate(3, 3, 0));
        }
        
        return null;
    }
    
}
