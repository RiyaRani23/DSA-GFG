package Sorting;
import java.util.*;
public class IntersectionSortedArr {
    // Function to find the intersection of two arrays
    ArrayList<Integer> intersection(int[] a, int[] b) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0 , right = 0 ;
        int n = a.length;
        int m = b.length;
        while(left < n && right < m){
            // Skip duplicates 
            if (left > 0 && a[left] == a[left-1]){
                left ++;
                continue;
            }
            // Skip the smaller
            if(a[left] < b[right]){
                left ++;
            }
            else if(a[left] > b[right]){
                right++;
            }
            // Add if equal and move both
            else {
                list.add(a[left]);
                left ++;
                right++;
            }
        }
      return list;
        
    }
}
