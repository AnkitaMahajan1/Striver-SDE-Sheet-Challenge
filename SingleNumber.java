class Solution {
    public int singleNumber(int[] nums) {
        //1. check if array length is less than 1: if so return error(-1)
        if (nums.length <1)
            return -1;
			
        //2. initialise answer as 0
        int ans = 0;
        
		//3. for the integers(i) in the array nums
        for(int i: nums){
            
			// 3.1. compute ans ^ (XOR) i
            ans ^= i;   
				// 0 ^ 0 = 0
				// 0  ^ 1 = 1
				// 1 ^ 0 = 1
				// 1 ^ 1 = 1
        }
        
		//4. return the ans
        return ans;
    }
}
