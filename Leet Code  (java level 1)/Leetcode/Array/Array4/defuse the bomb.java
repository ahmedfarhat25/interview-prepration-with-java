class Solution {
    public int[] decrypt(int[] code, int k) {
        int n=code.length;
        int [] out= new int[n];
        

        if(k==0){
            for(int i=0;i<n;i++) out[i]=0;
        }
        
        else if(k>0){
            for(int i=0;i<n;i++){
                int x=i+1;
                int sum=0;
                for(int j=0;j<k;j++){
                    if(x>=n) x=0;
                    sum+= code[x];
                    x++;
                }
                out[i]=sum;

            }
        }

        else{
            for(int i=0;i<n;i++){
                int x=i-1;
                int sum=0;
                for(int j=0;j<Math.abs(k);j++){
                    if(x<0) x=n-1;
                    sum+= code[x];
                    x--;
                }
                out[i]=sum;

            }

        }
        return out;

}}