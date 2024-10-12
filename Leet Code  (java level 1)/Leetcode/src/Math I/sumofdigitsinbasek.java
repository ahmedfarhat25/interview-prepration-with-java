public class sumofdigitsinbasek
{
    class Solution {
        public int sumBase(int n, int k) {
            int a=n;
            int ans=0;
            while(a>0){
                int r=a%k;
                a=a/k;
                ans+=r;
            }
            return ans;
        }
    }
}
