public class SubsequenceOfString {
     public boolean isSubSeq(String s1, String s2) {
        // code here
        int n = s1.length();
        int m = s2.length();
        int left = 0 , right = 0;
        while(left < n && right < m){
            if(s1.charAt(left) == s2.charAt(right)){
                left++;
                right++;
            }
            else{
                right++;
            }
        }
        return left == n;
    }
}
