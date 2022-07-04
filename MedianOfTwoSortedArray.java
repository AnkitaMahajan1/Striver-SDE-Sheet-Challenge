class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int i = 0, k = 0, j = 0;
        while(i < nums1.length){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        Arrays.sort(arr);
        if(arr.length % 2 == 0){
            double sum = arr[arr.length/2] + arr[(arr.length/2) -1];
            return sum/2.00;
        }
        return arr[arr.length/2];
        
    }
}
