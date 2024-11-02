class Solution {
    public int heightChecker(int[] heights) 
    {
        int[] a=heights.clone();
        Arrays.sort(a);
        int cnt=0;
        for (int i=0; i <heights.length;i++) 
        {
            if (a[i]!=heights[i]) ++cnt;
        }
        return cnt;
    }
}