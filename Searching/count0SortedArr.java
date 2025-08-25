public class count0SortedArr {
    int countZeroes(int[] arr) {
        // code here
          int n = arr.length ;
        int first = firstOccurence(arr , n);
        return n - first ;
    }
public int firstOccurence(int[] arr , int n){
        int low = 0 , high = n - 1;
        int ans = -1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] != 0){
                low = mid + 1;
            }
            else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }
}
