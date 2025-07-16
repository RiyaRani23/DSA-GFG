package Recursion;

public class fibonacci {
       static int fibonacciRecursion(int n) {
        
        if (n==0 || n==1) {
            return n;}
        return (fibonacciRecursion(n-1)+ fibonacciRecursion(n-2));
    }
}
