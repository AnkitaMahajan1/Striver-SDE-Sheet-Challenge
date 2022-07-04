class Solution {
    public long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        int s = m+n;
       int [] c = new int [m+n];
       
       for(int i=0;i< s; i++) {
           if( i<n ) {
               c[i] = arr1[i];
           }
           else {
               c[i] = arr2[i-n];
           }
       }
       Arrays.sort(c);
       
       return c[k-1];
        
    }
}
