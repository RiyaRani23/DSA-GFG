public class TrappedWater {
    public int maxWater(int arr[]) {
        int n=arr.length;
        if (n <= 2) return 0;
        // calculate left maximum height boundary -> array
        int leftMax[]=new int [n];
        leftMax[0] = arr[0];
        for (int i=1 ;i<n; i++){
            leftMax[i]= Math.max(arr[i], leftMax[i-1]);
        }
        // calculate right maximum height boundary -> array
        int rightMax[] = new int [n];
        rightMax[n-1] = arr [n-1];
        for (int i=n-2 ; i>=0 ; i--){
            rightMax[i] = Math.max(arr[i], rightMax[i+1]);
        }
        int trappedWater = 0;
        for (int i =0 ; i<n; i++){
            // find water level -> minimum (leftMax, rightMax)
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            
            // find trapped water -> waterlevel - height
             trappedWater += waterLevel- arr[i];
        }
        return trappedWater;
    }
}
