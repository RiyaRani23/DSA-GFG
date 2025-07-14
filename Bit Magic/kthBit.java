
public class kthBit {
     static boolean checkKthBit(int n, int k) {
        // code here
        int bitMask=1<<k;
         return ((n & bitMask) != 0);
    }
    
}
