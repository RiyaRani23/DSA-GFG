public class SearchAlmostSortedArr {
      public int findTarget(int arr[], int target) {
        // code here
        int n = arr.length;
       int start = 0 ,end = n -1;
       while(start <= end){
           int mid = (start + end) / 2;
           
        //   if target in the middle
           if(arr[mid] == target)  return mid;
           
        //  if target in the mid-1 place 
           else if (mid - 1 >= start && arr[mid - 1] == target){
               return mid -1;
           }
        //   if target in the mid+1 place
           else if(mid + 1 <= end && arr[mid + 1] == target) {
                return mid + 1;
          }
        //   if target is larger than mid 
          else if (arr[mid] < target){
               start = mid + 2;
           }
        //   if target is smaller than mid
           else 
             end = mid - 2;
       }
       return -1;
    }
}
