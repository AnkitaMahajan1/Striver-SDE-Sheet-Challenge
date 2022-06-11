import java.util.* ;
import java.io.*; 
public class Solution {
	public static int findMajority(int[] nums, int n) {
		// Write your code here.
        int count = 0;
        int ele = nums[0];
        for(int i = 0; i < nums.length; i++){
            if(count == 0){
                ele = nums[i];
            }
            if(nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }
        count = 0;
        for(int i : nums){
            if(i == ele)count++;
        }
        if(count <= n/2)return -1;
        return ele;
	}
}
