package Sorting;
public class KthSmallest {
    public static int kthSmallest(int[] arr, int k) {
        int n = arr.length;
        return quickSort(arr, 0 , n-1 , k-1);
    }
    
    public static int quickSort(int[] arr, int low , int high , int k){
        int pivotIndex = partition(arr , low , high);
        if(pivotIndex == k){
            return arr[pivotIndex];
        }
        else if(pivotIndex > k){
            return quickSort(arr , low , pivotIndex-1 , k);
        }
        else{
            return quickSort(arr , pivotIndex+1 , high , k);
        }
    }
    // find pivot index
    public static int partition(int[] arr , int low , int high){
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low ; j <= high ; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr , i , j);
            }
        }
        i++;
        swap(arr , i , high);
        return i;
    }
    // swap
    public static void swap(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
