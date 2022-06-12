class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)return false;
        
        int n = matrix.length;
        int m = matrix[0].length;
        
        int lo = 0;
        int high = (n*m) -1;
        
        while(lo <= high){
            int mid = lo + (high-lo) /2;
            if(matrix[mid/m][mid%m] == target)return true;
            
            if(matrix[mid/m][mid%m] < target){
                lo = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
    }
}





public class Solution {
	static boolean findTargetInMatrix(ArrayList<ArrayList<Integer>> matrix, int n, int m, int target) {
		// Write your code here.
        if(matrix.size() == 0)return false;
        int lo = 0;
        int high = (n*m) -1;
        
        while(lo <= high){
            int mid = lo + (high-lo) /2;
            if(matrix.get(mid/m).get(mid%m) == target)return true;
            
            if(matrix.get(mid/m).get(mid%m) < target){
                lo = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return false;
	}
}
