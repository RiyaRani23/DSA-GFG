package Sorting;
class SearchInRotatedArr{
public boolean search(int[] arr, int key) {
        // code here
        int n = arr.length;
        int low = 0 , high = n - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
           
            if(arr[mid] == key)   return true;
            // handle duplicates
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low++;
                high--;
                continue;
            }
             // if left part is sorted
            if (arr[low] <= arr[mid]){
                 if(arr[low] <= key && arr[mid] > key)
                    high = mid - 1;
                else   low = mid + 1;    
            }
            // if right part is sorted
            else{
                if(arr[mid] < key && arr[high] >= key){
                    low = mid + 1;
                }
                else  high = mid - 1;
            }
        }
        return false;
    }
}