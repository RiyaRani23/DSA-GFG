
public class missingElement2 {
    int missingNum(int arr[]) {
        // code here
        int XORall=0;
        int XOR_array=0;
        int n=arr.length+1;
        for(int i=1;i<=n;i++){
             XORall ^=i;
        }
        for(int i=0;i<arr.length;i++){
            XOR_array ^=arr[i];
        }
        return XORall^ XOR_array;
    }
    
}
