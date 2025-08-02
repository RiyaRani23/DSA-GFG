public class SecondLargest {
     public int getSecondLargest(int[] arr) {
        
         if (arr.length < 2) return -1;
         
         int largest=Integer.MIN_VALUE;
         int secondLargest=Integer.MIN_VALUE;
         for (int i=0 ; i < arr.length ; i++){
             if (largest < arr[i]){
                 secondLargest=largest;
                 largest=arr[i];
             }
             else if(arr[i] > secondLargest && arr[i] != largest){
                 secondLargest=arr[i];
             }
           
         }
        //  all are same element 
         if(secondLargest == Integer.MIN_VALUE)
              return -1;
              
         return secondLargest;
        
    }
}
