public class Solution {
    public int books(ArrayList<Integer> A, int B) {
        int students = B;
	    long high = Long.MAX_VALUE;
	    long low = 0;
	    long mid, res = 0;
	    
	    if (B > A.size())
	        return -1;
	    
	    long sum = 0;
	    
	    for (int pages : A)
	        sum += pages;
	    
	    while (low <= high) {
	        
	        mid = low + ((high - low) >> 1);
	        
	        if (isPossible(A, B, mid, sum)) {
	            res = mid;
	            high = mid - 1;
	        } else {
	            low = mid + 1;
	        }
	    }
	    
	    return (int) res;
	    
	}
	
	private boolean isPossible(ArrayList<Integer> A, int B, long maxPage, long totalPages) {
	    
	    if (maxPage < totalPages / B)
	        return false;
	    
	    int index = 0;
	    int n = A.size();
	    int i;
	    
	    for (i = 0; i < B && index < n; i++) {
	        long page = maxPage;
	        long total = 0;
	        
	        while (total < maxPage && index < n) {
	            total += A.get(index);
	            if (total > maxPage)
	                break;
	            index++;
	        }
	    }
	    
	    if (index < n)
	        return false;
	    
	    return true;
    }
}
