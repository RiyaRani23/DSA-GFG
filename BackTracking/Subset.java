package BackTracking;
import java.util.ArrayList;
import java.util.Arrays;

class Subset {
    public ArrayList<ArrayList<Integer>> subsets(int arr[])
      {
        //   for lexicographical order
        Arrays.sort(arr);
        ArrayList<ArrayList<Integer>> answer=new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        int index=0;
        findSubsets(arr, index, curr, answer);
        return answer;
    }
     void findSubsets(int arr[], int index,ArrayList<Integer> curr,
                         ArrayList<ArrayList<Integer>>answer)
         {
            //  add copy of current subset in answer
             answer.add(new ArrayList<>(curr));
              
             for(int i= index; i<arr.length; i++){
                 curr.add(arr[i]);
                //  YES (recurse)
                findSubsets(arr,i+1,curr,answer);
                // NO (delete i.e Backtrack)
                curr.remove(curr.size()-1);
             } 
         }                 
}