import java.util.Arrays;

public class MinimizeHeight {
    int getMinDiff(int[] arr, int k) {
        int n=arr.length;
        if (n == 1) return 0;

        Arrays.sort(arr);
        // Initial difference
        int diff = arr[n - 1] - arr[0];

        int smallest = arr[0] + k;
        int largest = arr[n - 1] - k;

        for (int i = 0; i < n - 1; i++) {
            int min = Math.min(smallest, arr[i + 1] - k);
            int max = Math.max(largest, arr[i] + k);

            // Skip if min becomes negative
            if (min < 0) continue;

            diff = Math.min(diff, max - min);
        }

        return diff;
    }
}
