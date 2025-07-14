public class missingElement {
   
    int missingNum(int arr[]) {
        // code here
        long n=arr.length + 1;
        long expected_sum=n*(n+1)/2;
        long current_sum=0;
        for(int i=0;i<arr.length;i++){
            current_sum += arr[i];
        }
        return (int) (expected_sum-current_sum);
    }
}

