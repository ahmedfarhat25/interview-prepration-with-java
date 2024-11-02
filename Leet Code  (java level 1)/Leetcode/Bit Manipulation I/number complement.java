class Solution {
    public int findComplement(int num) {
        int i = 0, ans = 0;
        while (num != 0) {
            int temp = num & 1;
            if (temp == 0) {
                ans += (int) Math.pow(2, i);
            }
            num = num >> 1;
            i++;
        }
        return ans;
    }
}
