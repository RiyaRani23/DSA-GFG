import java.util.ArrayList;

public class Search {
     public int search(int k, ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).equals(k)) {
                return i + 1 ;
            }
        }
        return -1;
    }    
    
}
