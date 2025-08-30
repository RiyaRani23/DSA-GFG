public class MinimumRotatedSortedArr {
    public int findMin(int[] arr) {
        // complete the function here
        int n = arr.length;
        
        int low = 0 , high = n - 1;
        
        if (n == 1) return arr[0];
        
        if (arr[low] <= arr[high])   return arr[low];
        
        while(low < high){
            
            int mid = (low + high) / 2;
            
            if(arr[high] < arr[mid]){
                low = mid + 1;
            }
            else if (arr[high] > arr[mid]) {
                high = mid;
            }
            // handle duplicates
            else  high --;
        }
        return arr[low];
    }
}
