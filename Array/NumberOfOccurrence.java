public class NumberOfOccurrence {
    // Number of occurrence
  int countFreq(int[] arr, int target) {
        // code here
        int first = findFirst(arr,target);
        int last = findLast(arr , target);
        return last-first+1;
        
    }
    private static int findFirst(int[] arr, int target){
        int n = arr.length;
        int start = 0 , end = n-1;
        while(start <=end){
            int mid = (start + end ) / 2;
            if (arr[mid] < target)  start = mid +1;
            else if (arr[mid] > target ) end = mid -1;
            // first occurence
            else {
                if(mid==0 || arr[mid - 1] != target)  return mid;
                else  end = mid - 1 ;
            }
        }
        return 0;
    }
    
    private static int findLast(int[] arr, int target){
        int n = arr.length;
        int start = 0 , end = n-1;
        while(start <=end){
            int mid = (start + end ) / 2;
            if (arr[mid] < target)  start = mid +1;
            else if (arr[mid] > target ) end = mid -1;
            // first occurence
            else {
                if(mid== n-1|| arr[mid + 1] != target) return mid;
                else  start = mid + 1 ;
            }
        }
        return -1;
    }
}
