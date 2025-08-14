public class count1SortedArr {
    public int countOnes(int[] arr) {
        int n = arr.length;
        int start = 0, end = n - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (arr[mid] == 1) {
                // check if mid is last 1
                if (mid == n - 1 || arr[mid + 1] == 0) {
                    return mid + 1;
                }
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return 0; 
    }
}
