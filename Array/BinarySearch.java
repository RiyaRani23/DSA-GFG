public class BinarySearch {
    public int binarysearch(int[] arr, int k) {
        int start = 0, end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == k) {
                result = mid;        
                end = mid - 1;      
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return result;  
    }
}


