package Sorting;

import java.util.ArrayList;

public class UnionOfSortedArr {
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // code here
        int n = a.length;
        int m = b.length;
        ArrayList<Integer> list = new ArrayList<>();
        int left = 0 , right = 0;
        while(left < n && right < m){
            // Skip duplicates 
            if(left > 0 && a[left] == a[left - 1]){ 
                left++; 
                continue;
            }
            // Skip duplicates
            if(right > 0 && b[right] == b[right-1]){
                right++;
                continue;
            }
            // Add if smaller or greater element
            if(a[left] < b[right]){
                list.add(a[left]);
                left ++;
            }
            else if(a[left] > b[right]){
                list.add(b[right]);
                right ++;
            }
            else{
                list.add(a[left]);
                left++ ; right++;
            }
        }
        // Add leftover part 
        while(left < n){
            if(left == 0 || a[left] != a[left-1]){
              list.add(a[left]);
            }
            left++;
        }
        while(right < m){
            if(right == 0  || b[right] != b[right - 1]){
                list.add(b[right]);
                
            }
            right ++;
        }
        return list;
    }
}
