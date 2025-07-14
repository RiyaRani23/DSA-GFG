package Mathamatics;

public class PalindromeNumber {
    public static void IsPalindrome(int n){
        int myNum=n;
        int rev=0;
        while(n>0){
            int lastDigit=n%10;
            rev=(rev*10)+lastDigit;
            n=n/10;
        }
        if(rev==myNum){
            System.out.println("Palindrome number");
        }
        else
           System.out.println("not palindrome number");
    }    
}
