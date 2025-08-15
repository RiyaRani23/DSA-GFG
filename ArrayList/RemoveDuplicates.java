import java.util.*;
public class RemoveDuplicates {

    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        
        if (arr.length == 0) return result; 

        // Always add the first element
        result.add(arr[0]);
        
        // Compare each element with the previous one
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                result.add(arr[i]);
            }
        }
        
        return result;
    }
}


