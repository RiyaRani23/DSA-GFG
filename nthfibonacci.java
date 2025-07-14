public class nthfibonacci {
     public int nthFibonacci(int n) {
        // code here
        if (n==1 || n==0){
           return n;
        }
        return (nthFibonacci(n-1)+ nthFibonacci(n-2));
    }
}
