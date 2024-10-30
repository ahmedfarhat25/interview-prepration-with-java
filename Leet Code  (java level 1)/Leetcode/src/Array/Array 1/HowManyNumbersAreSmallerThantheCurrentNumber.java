public class HowManyNumbersAreSmallerThantheCurrentNumber
{
    class Solution {
        public int[] smallerNumbersThanCurrent(int[] nums) {
            int[] ans=new int[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                int cnt=0;
                for(int j=0;j<nums.length;j++)
                {
                    if(nums[j]<nums[i])cnt=cnt+1;
                    ans[i]=cnt;
                }
            }
            return ans;
        }
    }
}
