public class MajorityElement {
    int majorityElement(int arr[]) {
    // brute force method
        int n=arr.length;
        int majority=n/2;
        for (int i=0; i<n;i++){
            int count = 0;
            for(int j=0; j< n;j++){
                if (arr[i]==arr[j]) count++;
                if(majority < count)
                   return arr[i];
            }
        }
        return -1;
        
    }

}
