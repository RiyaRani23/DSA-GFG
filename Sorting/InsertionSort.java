package Sorting;

public class InsertionSort {
     public void insertionSort(int arr[]) {
        // code here
        int n = arr.length;
      for(int i = 1 ; i < n ; i++){
          int curr = arr[i];
          int prev = i-1;
        //   finding out the current position to insert
          while(prev >= 0 && arr[prev] > curr){
            //   Shifting of an element
            arr[prev + 1] = arr[prev];
            prev --;
          }
        //   Insertion
          arr[prev + 1] = curr;
      }   
    }
}
