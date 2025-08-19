public class ExtraElement {
    public int findExtra(int a[], int b[]) {
        // add code here.
        int n = a.length;
        int low = 0, high = n - 2; // b is shorter by 1 element

        while (low <= high) {
            int mid = (low + high) / 2;

            if (a[mid] == b[mid]) {
                // extra element is on right side
                low = mid + 1;
            } else {
                // extra element is on left side
                high = mid - 1; 
            }
        }

        return low;
    }
}
