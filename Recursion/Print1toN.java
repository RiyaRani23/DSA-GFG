package Recursion;

public class Print1toN {
    public void printNos(int n) {
        // Code here
        if(n==0) {
             return;}
        printNos(n-1);
        System.out.print(n + " ");
    }
}
