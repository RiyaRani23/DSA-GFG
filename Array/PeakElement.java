public class PeakElement {
     public int peakElement(int[] arr) {
        int n = arr.length;

        if (n == 0) return -1; // No peak in empty array
        if (n == 1) return 0;  // Only one element is always a peak

        for (int i = 0; i < n; i++) {
            boolean left = (i == 0 || arr[i] > arr[i - 1]);
            boolean right = (i == n - 1 || arr[i] > arr[i + 1]);

            if (left && right) {
                return i; 
            }
        }

        return -1; // peak element not present
    }
}
