package Recursion;

public class NumOfDigits {
   public static int countDigits(int n) {
        // Code here
        if(n==0) 
          return 0;
        return 1+ countDigits(n/10);
          
    }
}
