class Solution
 {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n   = points.length;
        int ans = 0;
        for(int i = 0; i<n-1; i++)
        {
            int x = points[i][0] - points[i+1][0];
            int y = points[i][1] - points[i+1][1];
            x = Math.abs(x);
            y = Math.abs(y);
            ans = ans + Math.max(x,y);
        }
        return ans;
    }
}