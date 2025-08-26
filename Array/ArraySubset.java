import java.util.Arrays;

public class ArraySubset {
    public boolean isSubset(int a[], int b[]) {
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        int left = 0 , right = 0;
        int n = a.length;
        int m = b.length;
        while(left < n && right < m){
            if(a[left] == b[right]){
                left++;
                right++;
            }
            else {
                left ++;
            }
        }
        return right == m;
    }
}
