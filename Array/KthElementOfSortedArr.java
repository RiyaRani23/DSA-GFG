
public class KthElementOfSortedArr{
    
    public int kthElement(int a[], int b[], int k) {
        int n = a.length;
        int m = b.length;

        if (k <= 0 || k > n + m) return -1; // boundary check

        int[] newArr = new int[n + m];
        int left = 0, right = 0, index = 0;

        // merge step
        while (left < n && right < m) {
            if (a[left] < b[right]) {
                newArr[index++] = a[left++];
            } else {
                newArr[index++] = b[right++];
            }
        }

        while (left < n) newArr[index++] = a[left++];
        while (right < m) newArr[index++] = b[right++];

        return newArr[k - 1]; // kth element (1-based)
    }
}

