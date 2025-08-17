public class SingleAmongDoubles {
     int single(int[] arr) {
        // code here
        int n = arr.length;
        int start = 0 , end = n-1;
        while(start < end){
            
            int mid = (start + end) / 2;
            // if mid is odd
            if ((mid % 2)== 1)  mid--;
            
            if (arr[mid] == arr[mid + 1]){
                // means single element in right part
                start = mid + 2;
            }
            // single part in left part
            else
               end = mid ;
        }
        return arr[start];
     }   
       
}
