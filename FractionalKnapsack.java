class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        Arrays.sort(arr, new itemComparator());
        int currWeight = 0;
        double currval = 0.0;
        for(int i = 0; i < n; i++){
            if(currWeight + arr[i].weight <= W){
                currWeight += arr[i].weight;
                currval += arr[i].value;
            }
            else{
                int remain = W - currWeight;
                currval += ((double)arr[i].value /(double) arr[i].weight) * (double) remain;
                break;
            }
        }
        return currval;
        
        
        
    }
}
