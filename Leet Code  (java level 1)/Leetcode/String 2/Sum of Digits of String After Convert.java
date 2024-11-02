class Solution {
    public int getLucky(String s, int k) {
         int sum = 0;
        for (char ch : s.toCharArray())
         {
            int temp = (ch - 'a') + 1;
            sum += temp / 10 + temp % 10;
        }
        k--;
        while (k > 0) {
            int ans = 0;
            while (sum > 0) {
                ans += sum % 10;
                sum /= 10;
            }
            sum = ans;
            k--;
        }

        return sum;
    }
}