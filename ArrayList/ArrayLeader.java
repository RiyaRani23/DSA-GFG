import java.util.ArrayList;

public class ArrayLeader {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> leaders = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean isLeader = true;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    isLeader = false;
                    break;
                }
            }

            if (isLeader) {
                leaders.add(arr[i]);
            }
        }

        return leaders;
    }
}

    

