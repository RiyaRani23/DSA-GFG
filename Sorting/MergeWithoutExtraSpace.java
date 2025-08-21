package Sorting;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
     public void mergeArrays(int a[], int b[]) {
        // code here
        int n = a.length , m = b.length ;
        int left = n-1 ; 
        int right = 0;
        while(left >= 0 && right < m){
            if(a[left] > b[right]){
                swap(a , b , left , right);
                left--;
                right ++;
            }
            else  break;
        }
        // sort array
    Arrays.sort(a);
    Arrays.sort(b);
    }
    
    public void swap(int[] a, int[] b, int i, int j) {
        int temp = a[i];
        a[i] = b[j];
        b[j] = temp;
    }
}
