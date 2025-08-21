package Sorting;

public class MergeSort {
    void mergeSort(int arr[], int l, int r) {
        // code here
      if(l >= r)   return;  // base case
      int mid = l + (r - l) / 2;
      mergeSort(arr, l ,mid);
      mergeSort(arr , mid+1 , r);
      merge (arr, l , mid , r);
    }
    public void merge(int arr[] , int start , int mid , int end){
        int temp [] = new int [end - start + 1];
        int i = start ;
        int j = mid + 1 ; 
        int k = 0;
        while(i <= mid && j <= end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }
            else {
                temp[k] = arr[j];
                j++;
                k++;
            }
           
        }    
            // for leftover element in 1st sorted part
            while(i <= mid)   temp[k++] = arr[i++];

            // for leftover element in 2nd sorted part
            while(j <= end)  temp[k++] = arr[j++];

            // Copy temp into original array
            
            for( k = 0 , i = start ; k < temp.length ; i++ , k++){
                arr[i] = temp[k];
            }
        
    }
}
