public class MaxProduct2 {
     int maxProduct(int[] arr) {
       int ans = Integer.MIN_VALUE;
       int n = arr.length;
       for(int i = 0 ; i<n ; i++){
           int prod=1;
           for(int j = i ; j< n; j++){
               prod *= arr[j];
               ans = Math.max(ans ,prod);
           }
       }
        return ans;
    }
   
}
