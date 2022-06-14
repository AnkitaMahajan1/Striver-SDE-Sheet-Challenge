//T(C) - O(nlogn), S(C) - O(n)
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {
	public static int subarraysXor(ArrayList<Integer>  A, int B) {
		// Write your code here.
        HashMap<Integer, Integer> freq = new HashMap<>();
        int count = 0;
        int xorr = 0;
        int n = A.size();
        for(int i = 0; i < n; i++){
            xorr = xorr ^ A.get(i);
            if(freq.get(xorr ^ B) != null){
                count += freq.get(xorr ^ B);
            }
            if(xorr == B)count++;
            if(freq.get(xorr) != null){
                freq.put(xorr, freq.get(xorr) +1);
            }
            else{
                freq.put(xorr,1);
            }
        }
        return count;
	}
}
