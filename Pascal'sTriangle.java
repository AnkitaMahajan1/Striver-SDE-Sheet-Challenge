ArrayList<ArrayList<Long>> ans = new ArrayList<ArrayList<Long>>();
        ArrayList<Long> cur = null;
        ArrayList<Long> prev = null;
        for(int i=0;i<n;i++){
           cur = new ArrayList<Long>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i)
                    cur.add( (long) 1);
                else
                    cur.add(prev.get(j) + prev.get(j-1));
               
            }
            prev = cur;
            ans.add(cur);
        }
        return ans;


class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
         for(int i=1; i<=numRows; ++i){
          ArrayList<Integer> row = new ArrayList<>();
          for(int j=0;j<i;++j){
              if(j==0 || j==i-1) 
                  row.add(1);
              else {
                  row.add(result.get(i-2).get(j-1)+result.get(i-2).get(j));
              }  
          }
          result.add(row); 
        }
        return result;
    }
}
