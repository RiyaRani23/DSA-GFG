

public class SearchIndex {
    public static int searchIndex(int arr[],int key,int i){
        if (i==arr.length)  return 0;
        if(arr[i]==key){
            return i;
        }
      
        return searchIndex(arr,key,i+1);

    }
}
