package Mathamatics;

public class SumEvenDigits {
    public static void main(String args []){
        int n=68;
        int sumEven=0;
        int sumOdd=0;
        while(n>0){
            int lastDigit=n%10;
            if (lastDigit%2==0){
                 sumEven+=lastDigit;
            }
            else{
                sumOdd+=lastDigit;
            }
            n=n/10;
        }
        System.out.println("sum of even digits is "+ sumEven + " sum of odd digits is " + sumOdd);


    }
    
}
