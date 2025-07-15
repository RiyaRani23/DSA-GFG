package Recursion;

public class Powerofnum {
     static int RecursivePower(int n, int p) {
        // Code here
        if(p==0) return 1;
        int power = n* RecursivePower(n,p-1);
        return power;
    }
}
