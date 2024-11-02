class Solution {
    public int bitwiseComplement(int n) {
         String w = Integer.toBinaryString(n);
        StringBuilder s = new StringBuilder(w);
            System.out.println(s);
        for(int i=0;i<s.length();i++){
            if( s.charAt(i) == '1')
            {
                     s.setCharAt(i,'0');
            }
            else{
                s.setCharAt(i,'1');
            }
        }
        String a = s. toString();
        return  Integer.parseInt(a, 2);
    }
}