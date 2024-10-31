class Solution {
    public int[] sumZero(int n)
    {
        int[] ans= new int[n];
        if(n%2==1)   n-=1;
        for (int i=0;i<n;i++) 
        {
            if (i%2==0)ans[i]=(i+1);
            else ans[i]=-i;                
        }

        return ans;
        
    }
}