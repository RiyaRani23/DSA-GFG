public class TrainDeparture {
    // Function to find the minimum number of platforms required at the station
    static int findPlatform(int arr[], int dep[]) {
        Arrays.sort(arr);  // Sort arrival times
        Arrays.sort(dep);  // Sort departure times

        int n = arr.length;
        int platforms = 0;
        int result = 0;

        int i = 0, j = 0;

        while (i < n && j < n) {
            if (arr[i] <= dep[j]) {
                platforms++; // Train arrives
                i++;
            } else {
                platforms--; // Train departs
                j++;
            }
            result = Math.max(result, platforms); // Update max platforms
        }

        return result;
    }
}


