public class PeakElement {
     public int peakElement(int[] arr) {
        int n = arr.length;

        int start = 0 , end = n-1 ; 
        
        
        while (start <= end){
            int mid = (start + end )/2 ; 

            if ( (mid==0 || arr [mid - 1] < arr[mid] ) &&
                (mid == n-1 || arr[mid + 1] < arr[mid]) ){
                    return mid;
            }
            // move left half part
            if (mid > 0 && arr[mid-1] > arr[mid]) {
                end = mid-1; 
            }
            // move right half part
            else {
                start = mid+1;
            }
                
        }
       return -1; 
    
    }
}