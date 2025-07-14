package Mathamatics;

public class ReverseOfNo {
     public static void main(String args[]){
        int n=876;
        // only print reverse number
         while(n>0){          
            int lastDigit=n%10;
            System.out.print(lastDigit);
             n=n/10;
        }
        
        // reverse number and store it any variable
         int num=876;
         int temp=num;
        int rev=0;
        while(num>0){
           int lastDigit=num%10;
           rev= (rev*10)+lastDigit;
           num=num/10;
        }
        System.out.println(" \nthe reverse of "+ temp + " is " + rev);
        
   }
    
}
