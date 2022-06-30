class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> result = new ArrayList<>();
        subset(result, arr, N, 0, 0);
        Collections.sort(result);
        return result;
        
    }
    void subset(ArrayList<Integer> result,ArrayList<Integer> arr, int N, int i, int op){
        if(i == N){
            result.add(op);
            return;
        }
        subset(result, arr, N, i+1, op + arr.get(i));
        subset(result, arr, N, i+1, op);
        
    }
}
