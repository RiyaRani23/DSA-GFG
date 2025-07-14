package Mathamatics;
 import java.util.*;
public class PositiveNo {
    // positive number
     public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any number");
        int num =sc.nextInt();
        if(num>=0){
            System.out.println("Postive number");
        }
        else{
            System.out.println("Negative number");
        }
        sc.close();
    }
}

