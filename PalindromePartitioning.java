class Solution {
static List<List> panlidromeStringsBig;
public static List<List> partition(String s) {

	  panlidromeStringsBig= new ArrayList<List<String>>();
      
	
		   partitionString( s,  0, new ArrayList<String>());
		  return panlidromeStringsBig;
	  
	 
	
    }

  private static void partitionString(String s, int index, List<String> panlidromeStrings) {
	
	 
	  	for(int i=index;i<s.length();i++) {
	  		List<String> currPalind= new ArrayList<String>();
	  		currPalind.addAll(panlidromeStrings);
		  String currString = s.substring(0,i+1);
		  String remString = s.substring(i+1,s.length());
		  
		  if(isSubStringPalindrome(currString) ) {
			
			  currPalind.add(currString);
			//  panlidromeStrings.add(remString);
			  if(remString.isEmpty()) {
				  panlidromeStringsBig.add(currPalind);
			  }
			  else {
			 partitionString(remString,0, currPalind);
			
				  }
			 
		  }
	  }
		
	  
	  
	  
  }
  

private static boolean isSubStringPalindrome(String s) {
	
	
	int start=0;
	int end =s.length()-1;
	
	if(start==end) return true; //todo
		
		while(start<(s.length()/2)+1) {
			
			if(s.substring(start, start+1).equals(s.substring(end, end+1))) {
				start++;
				end--;
			}
			else return false ;				
			
		}
		
		return true;
}
}
