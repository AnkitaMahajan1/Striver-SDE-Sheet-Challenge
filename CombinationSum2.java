class Solution {
    List<List<Integer>> finalList = new ArrayList<>();
    List<Integer> currentList = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
    dfs(candidates,target , 0);
    return finalList;
}

public void dfs(int[] candidates, int currentValue , int j){

    if (currentValue == 0){
        finalList.add(new ArrayList<>(currentList));
    }

    for (int i = j; i < candidates.length; i++) {
        if (currentValue - candidates[i] >= 0){
            if (i > j && candidates[i] == candidates[i - 1])
                continue;
            currentList.add(candidates[i]);
            //here we add j by i + 1 , we push the pointer to right by one , to make sure in the next call we won't choose that index anymore
            dfs(candidates , currentValue - candidates[i] , i+1);
            currentList.remove(currentList.size() - 1);
            }
        }
    }
}
