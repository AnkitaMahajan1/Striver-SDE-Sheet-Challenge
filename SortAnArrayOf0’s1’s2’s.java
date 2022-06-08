Dutch National Flag Algorithm:

class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length -1;
        while(mid <= high){
            switch(nums[mid]){
                case 0:
                    int tempu = nums[low];
                    nums[low] = nums[mid];
                    nums[mid] = tempu;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    int tempa = nums[high];
                    nums[high] = nums[mid];
                    nums[mid] = tempa;
                    high--;
                    break;
            }
        }
    }
}
