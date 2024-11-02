class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int mx=0,cnt=0;
        for (int num : nums) {
            if (num == 1){
                ++cnt;
            }else{
                cnt=0;
            }
            mx=Math.max(mx,cnt);
        }
        return mx;
    }
}