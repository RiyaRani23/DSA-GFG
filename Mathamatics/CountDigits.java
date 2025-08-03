package Mathamatics;

public class CountDigits {
     static int evenlyDivides(int n) {
        int lastDigit = 0 ;
        int num = n;
        int count = 0;
        while(n > 0){
            lastDigit= n % 10;
            if (lastDigit != 0 && num % lastDigit == 0){
                count ++;
            }
            n = n/10;
        }
        
        return count;
    }
}
