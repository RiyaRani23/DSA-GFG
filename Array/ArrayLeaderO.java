 import java.util.ArrayList;
import java.util.Collections;
public class ArrayLeaderO {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaderList = new ArrayList<>();
        int n = arr.length;
        
        // Optimised Method
        if (n == 0) return leaderList;
        
        int maxRight = arr[n - 1];
        // Last element is always a leader
        leaderList.add(maxRight); 
        
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaderList.add(maxRight);
            }
        }

        // To maintain original order
        Collections.reverse(leaderList);
        return leaderList;
    }
}

