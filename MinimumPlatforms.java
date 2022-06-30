class Solution
{
    //Function to find the minimum number of platforms required at the
    //railway station such that no train waits.
    static int findPlatform(int arr[], int dep[], int n)
    {
        // add your code here
         Arrays.sort(arr);
       Arrays.sort(dep);
       int i=0;
       int j=0;
       int maxtrain=0;
       int platform=0;
       while(i<n && j<n){
           if(arr[i]<=dep[j]){
               maxtrain++;
               i++;
           } else{
               maxtrain--;
               j++;
           }
           platform=Math.max(platform,maxtrain);
       }
       return platform;
        
    }
    
}
