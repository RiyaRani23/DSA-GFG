import java.util.Arrays;

public class AggressiveCow {
     public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort (stalls);
        int start = 1 ;
        // Maximum = largest - smallest 
        int end = stalls [n-1] - stalls [0];
        int ans = -1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            if (ifPossible(stalls, k ,mid)){
                ans = mid ; 
                // try larger distance
                start = mid + 1;
            }
            else {
                // try smaller distance
                end = mid - 1;
            }
        }
        return ans;
    }
   public boolean ifPossible(int [] stalls , int k , int mid){
        int cows = 1; 
        int lastPos = stalls[0];
        for(int i = 1 ; i < stalls.length; i++){
            
            if (stalls[i] - lastPos >= mid){
                cows++;
                lastPos = stalls[i];
            }
            if(cows >= k )  return true;
        }
        return false;
    }
}
