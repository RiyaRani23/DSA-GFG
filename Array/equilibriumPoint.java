public class equilibriumPoint {
    // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        int n=arr.length;
        int right_sum=0;
        for(int i=0; i<n; i++){
            right_sum +=arr[i];
        }
        int left_sum=0;
        for(int i=0; i<n ;i++){
            right_sum -= arr[i];
            
            if(left_sum == right_sum){
                return i;
            }
             
            left_sum += arr[i];
        }
        
        return -1;
        // no equilibrium point
    }
}
