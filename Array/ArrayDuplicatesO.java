import java.util.ArrayList;

public class ArrayDuplicatesO {
    public ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                // Seen before -> duplicate
                result.add(index + 1);
            } else {
                // Mark as visited
                arr[index] = -arr[index];
            }
        }

        return result;
    }
}

