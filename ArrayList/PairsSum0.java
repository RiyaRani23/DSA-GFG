
import java.util.ArrayList;
import java.util.Arrays;


public class PairsSum0 {
    public static ArrayList<ArrayList<Integer>> getPairs(int[] arr) {
        // O(n log n)
        Arrays.sort(arr); 
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == 0) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[left]);
                pair.add(arr[right]);
                answer.add(pair);

                // Skip all duplicates of left and right values
                int leftVal = arr[left];
                int rightVal = arr[right];
                while (left < right && arr[left] == leftVal) left++;
                while (left < right && arr[right] == rightVal) right--;

            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }

        return answer;
    }
}
