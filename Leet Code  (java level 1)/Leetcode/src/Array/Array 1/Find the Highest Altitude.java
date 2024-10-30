class Solution {
    int largestAltitude(int[] gain)
     {
          int[] ans=new int[gain.length+1];
          ans[0]=0;
          int mx= 0;
          for (int i =0;i<gain.length;i++)
          {
              ans[i+1] = ans[i]+gain[i];
              mx = Math.max(mx,ans[i+1]);
          }
          return mx;
    }
  }