public class RotatedSortedArray {
    class Solution {
    int search(int[] arr, int key) {
        int n = arr.length;
        int start = 0, end = n - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (arr[mid] == key) return mid;
            
            // Left part is sorted
            if (arr[start] <= arr[mid]) {
                if (key >= arr[start] && key < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            // Right part is sorted
            else {
                if (key > arr[mid] && key <= arr[end])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}

}
