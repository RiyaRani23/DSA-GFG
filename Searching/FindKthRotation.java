public class FindKthRotation {
   
    public int findKRotation(int arr[]) {
        // Code here
        int n = arr.length;
       int start = 0 , end = n-1;
        //  if subarray already sorted
           if(arr[start] < arr[end])  return start;
    //    find the index of minimum element and that is the no. of rotation in an array
      while (start < end){
          int mid = (start + end)/2;
          if (arr[end] < arr[mid]){
              start = mid + 1;
          }
          else if (arr[end] > arr[mid]){
              end = mid;
          }
          else  end --;
      }
      return start;
    }

    //  public int findKRotation(int arr[]) {
    //     // Code here
    //     int n = arr.length;
    //    int start = 0 , end = n-1;
    //    while(start <= end){
    //     //   if subarray already sorted
    //        if(arr[start] < arr[end])  return start;
    //        int mid = (start + end) / 2; 
    //         int next = (mid + 1) % n;
    //         int prev = (mid + n - 1) % n;
            
    //         // Check if mid is minimum
    //         if (arr[mid] <= arr[next] && arr[mid] <= arr[prev]) {
    //             return mid;
    //         }
            
    //         // Decide which half to move
    //         if (arr[mid] >= arr[start]) {
    //             // Left half is sorted - go right
    //             start = mid + 1;
    //         } else {
    //             // Right half is sorted - go left
    //             end = mid - 1;
    //         }
    //     }
     
    //       return 0;
    // }
}

