public class MaxSubarrayProduct {
    int maxProduct(int[] arr) {
        int pre=1;
        int suffix=1;
        int ans = Integer.MIN_VALUE;
        int n= arr.length;
        for(int i=0; i <n ; i++){
            if (pre==0) pre=1;
            if (suffix== 0 ) suffix=1;
             
            pre = pre * arr[i];
            suffix = suffix * arr[n-i-1];
            ans = Math.max(ans , Math.max(pre,suffix));
        }
        return ans;
    }
}
