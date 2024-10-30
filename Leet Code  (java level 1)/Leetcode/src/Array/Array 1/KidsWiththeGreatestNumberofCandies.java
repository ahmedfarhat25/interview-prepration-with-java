public class KidsWiththeGreatestNumberofCandies
{
    class Solution
    {
        public List<Boolean> kidsWithCandies(int[] candies, int extraCandies)
        {
            List<Boolean> ans = new ArrayList<>();
            int mx = 0;
            for (int i = 0; i < candies.length; i++) {
                mx = Math.max(mx, candies[i]);
            }
            for (int i = 0; i < candies.length; i++)
            {
                if (candies[i] + extraCandies >= mx)  ans.add(true);
                else    ans.add(false);
            }
            return ans;
        }
    }
}
