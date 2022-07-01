class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Set<List<Integer>> result = new LinkedHashSet<>();
        List<Integer> sublist = new LinkedList<>();
        Arrays.sort(nums);
        subset(result, nums, 0, sublist);
        return new ArrayList(result);
        
    }
    public void subset(Set<List<Integer>> result,int[] nums, int i,List<Integer> sublist){
        if(i == nums.length){
            result.add(new ArrayList(sublist));
            return;
        }
        sublist.add(nums[i]);
        subset(result, nums, i+1, sublist);
        sublist.remove(sublist.size()-1);
        subset(result, nums, i+1, sublist);
    }
}
