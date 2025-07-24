import java.util.ArrayList;

public class array_duplicates {
       public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> duplicatesList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if duplicate exists ahead
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // Check if already added
            boolean alreadyAdded = false;
            for (int k = 0; k < duplicatesList.size(); k++) {
                if (duplicatesList.get(k) == arr[i]) {
                    alreadyAdded = true;
                    break;
                }
            }

            // Add only if it's a duplicate and not already added
            if (isDuplicate && !alreadyAdded) {
                duplicatesList.add(arr[i]);
            }
        }

        return duplicatesList;
    }
}
