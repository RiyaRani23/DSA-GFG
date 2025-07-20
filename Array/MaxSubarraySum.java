public class MaxSubarraySum {
      int maxSubarraySum(int[] arr) {
        // Kadane's Algorithm
       int currSum=arr[0] , maxSum=arr[0];
       for (int i=1;i<arr.length;i++){
            currSum= Math.max(arr[i],currSum + arr[i]);
            maxSum= Math.max(maxSum, currSum);
       }
       return maxSum;
        
    }
}
