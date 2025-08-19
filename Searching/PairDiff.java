import java.util.Arrays;

public class PairDiff {
    public boolean findPair(int[] arr, int x) {
        // code here
        int n = arr.length;
        Arrays.sort(arr);
        
        x = Math.abs(x);

       int i = 0 , j = 1;
       while(i < n && j < n){
           if(i != j && arr[j] - arr[i] == x){
               return true;
           }
           else if (arr[j] - arr[i] < x ){
            //   For bigger difference
               j++;
           }
           else
        //   For Smaller difference
             i++ ;
       }
       return false;
    }
}
