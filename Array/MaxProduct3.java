public class MaxProduct3 {
    int maxProduct(int[] arr) {
        int ans = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int prod = 1;
                for (int k = i; k <= j; k++) {
                    prod *= arr[k];
                }
                ans = Math.max(ans, prod);
            }
        }

        return ans;
    }
}
