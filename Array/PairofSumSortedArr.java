public class PairofSumSortedArr {
     int countPairs(int arr[], int target) {
       int n = arr.length;
       int left = 0 , right = n-1;
       int count = 0;
       while (left < right){
           
            int sum = arr[left] + arr[right];

            if (sum == target) {
                
                //  all values in the array are equal 
                if (arr[left] == arr[right]) {
                    int length = right - left;
                    
                    // sum of first natural no. -> n(n+1) / 2 
                    count += (length * (length + 1)) / 2; 
                    break;
                }
                else{
                // different values    
                int countLeft = 1, countRight = 1;
                
                while (left < right && arr[left] == arr[left + 1]) {
                    countLeft++;
                    left++;
                }
                while (left < right && arr[right] == arr[right - 1]) {
                    countRight++;
                    right--;
                }

                count += countLeft * countRight;
                left++;
                right--;
                }
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
        return count;
    }
}
