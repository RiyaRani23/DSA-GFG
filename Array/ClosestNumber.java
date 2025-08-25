public class ClosestNumber {
     public static int findClosest(int[] arr, int k) {
        // code here
         int n = arr.length;
        int low = 0 , high = arr.length - 1;
        
         if (k <= arr[0]) return arr[0];
        if (k >= arr[n - 1]) return arr[n - 1];

        while(low <= high){
            int mid = (low + high)/2;
            
            if(arr[mid] == k) return arr[mid];
            
            if(arr[mid] > k && mid>0 && arr[mid - 1] < k){
                int d1 = Math.abs(arr[mid] - k);
                int d2 = Math.abs(arr[mid - 1] - k);
                if(d1 == d2)  return arr[mid];
                return  (d1 < d2) ? arr[mid] : arr[mid - 1];
            }
            
            else if(arr[mid] > k){
                high = mid - 1;
            }
            
            else   low = mid + 1;
        }
        return -1;
    }
}
