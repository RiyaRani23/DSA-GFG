package Array;

public class ReverseArray {
    
    public static void reverse(int arr[]){
        int start=0,end = arr.length-1;
        while (start<end){
            int temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            start++;
            end--;
        }
    }
}
