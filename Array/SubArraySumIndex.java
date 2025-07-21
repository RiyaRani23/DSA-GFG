

import java.util.ArrayList;

public class SubArraySumIndex {
     static ArrayList<Integer> subarraySum(int[] arr, int target) {
       ArrayList <Integer> index = new ArrayList<>();
            int left=0, sum=0;
            for (int right=0 ; right<arr.length ; right++ ){
                sum += arr[right];
                while(sum > target && left<= right ){
                    sum -=arr[left];
                    left++;
                }
                if(sum==target){
                    // 1 based indexing
                     index.add(left +1 );
                     index.add(right +1);
                     return index;
                }
                
        }
        index.add(-1);
        return index;
    }
}

