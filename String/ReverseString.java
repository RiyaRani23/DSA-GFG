public class ReverseString {
    class Solution {
    public static String reverseString(String s) {
        // code here
         String newReverse = "";
        
        for (int i = s.length() - 1; i >= 0; i--) {
            newReverse += s.charAt(i); 
        }
        
        return newReverse;
    }
}
}
