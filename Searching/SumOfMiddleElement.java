public class SumOfMiddleElement {
     public int SumofMiddleElements(int[] arr1, int[] arr2) {
        int n = arr1.length;

        if (arr1.length > arr2.length) {
            return SumofMiddleElements(arr2, arr1);
        }

        int low = 0, high = n;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = n - cut1;

            int left1 = (cut1 == 0) ? Integer.MIN_VALUE : arr1[cut1 - 1];
            int left2 = (cut2 == 0) ? Integer.MIN_VALUE : arr2[cut2 - 1];

            int right1 = (cut1 == n) ? Integer.MAX_VALUE : arr1[cut1];
            int right2 = (cut2 == n) ? Integer.MAX_VALUE : arr2[cut2];

            if (left1 <= right2 && left2 <= right1) {
                // found correct partition
                int maxLeft = Math.max(left1, left2);
                int minRight = Math.min(right1, right2);
                return maxLeft + minRight;
            } else if (left1 > right2) {
                high = cut1 - 1; // move left
            } else {
                low = cut1 + 1; // move right
            }
        }
        return -1; // shouldn't reach here
    }
}
