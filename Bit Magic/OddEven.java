package Bit Magic;

public class OddEven {
     static boolean isEven(int n) {
        // code here
        int bitMask=1;
        return ((n & bitMask )==0);
    }
}
