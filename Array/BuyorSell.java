public class BuyorSell {
      int stockBuySell(int arr[]) {
        // code here
        int profit = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                profit += arr[i] - arr[i - 1]; 
            }
        }
        return profit;
    }
}
