package Sorting;

import java.util.ArrayList;
import java.util.Collections;

class ChocolateDistribution{
         public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int n = arr.size();
        if (n < m)  return -1;
        
        if (n == m)  return arr.get(n-1) - arr.get(0);
        
        int minDiff = Integer.MAX_VALUE;
        
        for(int i = 0; m+i-1 < n ; i++)
        {
            int diff = arr.get(m + i - 1) - arr.get(i);
            minDiff = Math.min(diff,minDiff);
        }
        return minDiff;
    }    
}