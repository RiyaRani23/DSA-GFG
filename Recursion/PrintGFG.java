package Recursion;

public class PrintGFG {
     void printGfg(int N) {
        if(N==0) return ;
        printGfg(N-1);
        System.out.print("GFG ");
    }
}
