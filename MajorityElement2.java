import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> nums) 
    {
        // Write your code here.
        int n = nums.size();
        ArrayList<Integer> result = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int ele1 = 0;
        int ele2 = 0;
        for(int num: nums){
            if(ele1 == num){
                count1++;
            }
            else if(ele2 == num){
                count2++;
            }
            else if(count1 == 0){
                ele1 = num;
                count1++;
            }
            else if(count2 == 0){
                ele2 = num;
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int num: nums){
            if(num == ele1)count1++;
            if(num == ele2)count2++;
        }
        if(count1 > n/3)result.add(ele1);
        if(count2 > n/3)result.add(ele2);
        return result;
    }
}
