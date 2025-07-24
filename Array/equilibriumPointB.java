public class equilibriumPointB {
      // Function to find equilibrium point in the array.
    public static int findEquilibrium(int arr[]) {
        // Brute Force Method
        int n=arr.length;
       for(int i=0 ; i<n; i++){
           int leftSum=0 , rightSum =0;
        //    for left sum
           for(int j=0 ; j<i ; j++){
               leftSum += arr[j];
           }
        //   for right sum
           for (int j=i+1; j<n ;j++){
               rightSum += arr[j];
           }
           if(rightSum == leftSum)
             return i;
       }
    //   no equilibrium point
       return -1;
    }
}
