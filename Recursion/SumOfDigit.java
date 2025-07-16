package Recursion;

public class SumOfDigit {
     public static int sumOfDigits(int n) {
        // Code here
        if(n==0){
            return 0;
        }
        return sumOfDigits(n/10) + n % 10;
    }
}
