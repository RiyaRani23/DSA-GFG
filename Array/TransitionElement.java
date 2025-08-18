public class TransitionElement{
    int transitionPoint(int arr[]) {
        int n = arr.length;
        int start = 0, end = n - 1;
        int ans = -1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == 1) {
                ans = mid;       // record possible transition point
                end = mid - 1;   // look for earlier 1
            } else {
                start = mid + 1; // still in 0’s part
            }
        }
        return ans;
    }
}

