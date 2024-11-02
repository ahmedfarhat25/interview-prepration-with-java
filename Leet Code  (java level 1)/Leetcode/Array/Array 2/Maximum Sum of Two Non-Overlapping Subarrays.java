class Solution {
    public int maxSumTwoNoOverlap(int[] nums, int firstLen, int secondLen)
    {
        int n = nums.length;
        int ans=0;
        if (firstLen < secondLen)
        {
            int tmp  = firstLen;
            firstLen = secondLen;
            secondLen = tmp;
        }
        int[] prefix = new int[n + 1];
        prefix[1] = nums[0];
        for (int i = 2; i <= n; i++)  prefix[i] = prefix[i - 1] + nums[i - 1];
        for (int i = 1; i <= n - firstLen + 1; i++) 
        {
            int remn = n - i - firstLen + 1;
            int remp = i - 1;
            if (!(remn >= secondLen || remp >= secondLen))    continue;
            int sum1 = prefix[i + firstLen - 1] - prefix[i - 1];
            int mx = 0;
            if (remn >= secondLen)
             {
                for (int j = i + firstLen; j <= n - secondLen + 1; j++)
                 {
                    int tmp = prefix[j + secondLen - 1] - prefix[j - 1];
                    mx = Math.max(tmp, mx);
                }
            }
            if (remp >= secondLen) 
            {
                for (int j = 1; j <= i - secondLen; j++) 
                {
                    int tmp=prefix[j+secondLen-1]-prefix[j-1];
                    mx = Math.max(tmp, mx);
                }

            }

            ans = Math.max(ans, mx+ sum1);
        }


        return ans;
        
    }
}