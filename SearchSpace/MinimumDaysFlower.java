package SearchSpace;

public class MinimumDaysFlower {
     public int minDaysBloom(int[] arr, int k, int m) {
        int n = arr.length;
       
        if (n <  k * m) return -1;

        int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
        for (int i = 0 ; i < arr.length ; i++) {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }

        int low = mini , high = maxi;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(arr, mid, k, m)) {
                // try smaller day
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

     boolean possible (int[] arr, int day, int k, int m) {
        int count = 0 , noOfB = 0;
        for (int i = 0 ; i < arr.length ; i++) {
            if (arr[i] <= day) {
                count++;
            } 
            else {
                noOfB += (count/k);
                count = 0;
            }
        }
        noOfB += (count/k);
        return noOfB >= m;
    }
}
