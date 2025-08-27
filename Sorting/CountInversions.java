package Sorting;

public class CountInversions {
   static int inversionCount(int arr[]) {
        // Code Here
        return mergeSort(arr,0,arr.length-1);
    }
    static int mergeSort(int[] arr, int left , int right){
        int res = 0 ; 
       
        if (left < right){
            int mid = left + (right - left)/2;
            // count inversion in left half
            res += mergeSort(arr , left , mid);
            // count inversion in right half
            res += mergeSort(arr , mid + 1, right);
            // count 
            res += countAndMerge(arr,left,mid,right);
         }
         return res;
    }
    // Merge two sorted array and count inversion
    static int  countAndMerge(int[] arr ,int left , int mid , int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i=0 ; i < n1; i++) {
            L[i] =arr[ left + i];
        }
         for(int i=0 ; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }
        int i = 0 , j = 0 , k = left ,swap = 0;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k++] = L[i++];
            } else {
                arr[k++] = R[j++];
                swap += (n1 - i);
            }
        }
         while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];

        return swap;
    }
}
