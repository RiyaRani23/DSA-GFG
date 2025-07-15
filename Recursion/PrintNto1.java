package Recursion;

public class PrintNto1 {
    void printNos(int N) {
        if(N==0) return;
        System.out.print(N + " ");
        printNos(N-1);
        
    }
}
