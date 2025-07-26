public class MajorityElement {
    int majorityElement(int arr[]) {
    // BRUTE FORCE METHOD
        // int n=arr.length;
        // int majority=n/2;
        // for (int i=0; i<n;i++){
        //     int count = 0;
        //     for(int j=0; j< n;j++){
        //         if (arr[i]==arr[j]) count++;
        //         if(majority < count)
        //            return arr[i];
        //     }
        // }
        // return -1;
        int count = 0,candidate = 0;
        //  Find a candidate
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                candidate = arr[i];
                count = 1;
            } else {
                if (arr[i] == candidate)  count++;
                else     count--;
            }
        }

        // Step 2: Confirm the candidate
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == candidate) {
                count++;
            }
        }

        if (count > arr.length / 2) {
            return candidate;
        } else {
            return -1;
        }
    }
}
