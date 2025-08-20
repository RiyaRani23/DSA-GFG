package Sorting;

public class SelectionSort {
     void selectionSort(int[] arr) {
        // code here
        int n = arr.length;
        
        for(int i = 0 ; i < n-1 ; i++){
            int minPos = i;
            for(int j = i + 1 ; j < n ; j++){
                if (arr[minPos] > arr[j])
                    minPos = j ;
            }
            // swap
            int temp = arr[i];
            arr[i] = arr[minPos];
            arr[minPos] = temp;
            
        }
    }
}
