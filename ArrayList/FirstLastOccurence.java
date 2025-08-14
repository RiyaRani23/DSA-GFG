import java.util.*;
public class FirstLastOccurence {
     ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int first = findFirst(arr,x);
        int last = findLast(arr,x);
        list.add(first);
        list.add(last);
        return list;
    }
        
       
         public static int findFirst(int[] arr, int x) {
        int n = arr.length;
        int start = 0, end = n - 1, ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < x) {
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                ans = mid;
                end = mid - 1; // keep going left
            }
        }
        return ans;
    }
        
        
       
        public static int findLast(int[] arr, int x) {
        int n = arr.length;
        int start = 0, end = n - 1, ans = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] < x) {
                start = mid + 1;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                ans = mid;
                start = mid + 1; // keep going right
            }
        }
        return ans;
    }
}
