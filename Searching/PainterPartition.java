public class PainterPartition{
    public int minTime(int[] arr, int k) {
        
        int low = 0, high = 0;
        for (int num : arr) {
            low = Math.max(low, num); 
            high += num;
        }
        
        int result = high;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1; 
            }
        }
        
        return result;
    }
    
    public boolean isPossible(int[] arr, int k, int maxTime) {
        int painters = 1;
        int currSum = 0;
        
        for (int num : arr) {
            if (currSum + num > maxTime) {
                painters++;
                currSum = num;
                
                if (painters > k)  return false;
            } else {
                currSum += num;
            }
        }
        
        return true;
    }
}