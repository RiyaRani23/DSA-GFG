public class Move0toEnd {
      void pushZerosToEnd(int[] arr) {
        int index = 0; 

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }

    
        while (index < arr.length) {
            arr[index++] = 0;
        }
    }
}
