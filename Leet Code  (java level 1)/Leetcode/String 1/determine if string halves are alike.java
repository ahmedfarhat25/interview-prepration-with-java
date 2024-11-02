class Solution {
    public boolean halvesAreAlike(String s)
     {
    String s1=s.substring(0,s.length()/2);
     String s2=s.substring(s.length()/2);
     char[]arr=s1.toCharArray();
     char[] arr1=s2.toCharArray();
     int cnt=0,cnt1=0;
     for(int i=0;i<arr.length;i++)
     {
         if(arr[i]=='a' || arr[i]=='A' || arr[i]=='e' || arr[i]=='E' || arr[i]=='i' || arr[i]=='I' || arr[i]=='o' || arr[i]=='O' || arr[i]=='u' || arr[i]=='U')
         {
             cnt++;
         }
     }
     for (int i=0;i< arr1.length;i++)
     {
         if(arr1[i]=='a' || arr1[i]=='A' || arr1[i]=='e' || arr1[i]=='E' || arr1[i]=='i' || arr1[i]=='I' || arr1[i]=='o' || arr1[i]=='O' || arr1[i]=='u' || arr1[i]=='U')
         {
             cnt1++;
         }
     }
     if(cnt==cnt1) return true;
     else return false;
    }
}