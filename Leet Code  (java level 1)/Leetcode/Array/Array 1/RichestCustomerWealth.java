public class RichestCustomerWealth
{
    class Solution {
        public int maximumWealth(int[][] accounts) {
            int arr[][]=new int[accounts.length][];
            int m=0;
            for(int i=0;i<accounts.length;i++){
                int c=0;
                for(int j=0;j<accounts[i].length;j++){
                    c+=accounts[i][j];
                    if(c>m){
                        m=c;
                    }
                }
            }
            return m;
        }
    }
}
