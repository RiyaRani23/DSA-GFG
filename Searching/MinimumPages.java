public class MinimumPages {
    public int findPages(int[] arr, int k) {
        // code here
        int n = arr.length;
        // no. of books less than student
        if (k > n) return -1;

        int minPages = 0, sum = 0 ;  
        
        for (int i = 0; i < n; i++){
            sum += arr[i];
        } 
        
        int maxPages = sum ;
        int ans = -1;
        int mid = (maxPages + minPages)/2 ;
        while(minPages <= maxPages){
            
            if (isPossible(arr, n, k, mid)){
                ans = mid;
                maxPages = mid-1;
            }
            else {
                minPages = mid + 1;
            }
            mid = (maxPages + minPages) / 2;
        }
        
        return ans;
    }
    public boolean isPossible (int[] arr, int n , int k , int mid){
        int studentCount = 1;
        int pageSum = 0;
        
        for (int i=0 ; i<n ; i++){
            if(pageSum + arr[i] <= mid){
                pageSum += arr[i];
            }
            else {
                studentCount ++;
                if (studentCount > k || arr[i] > mid)  return false;
                pageSum = arr[i];
            }
        }
        return true;
    }
}
