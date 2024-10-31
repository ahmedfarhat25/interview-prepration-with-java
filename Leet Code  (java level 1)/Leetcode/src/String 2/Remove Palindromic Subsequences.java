class Solution {
    public int removePalindromeSub(String s) {
          StringBuilder p= new StringBuilder(s);
        if(s.equals(p.reverse().toString()))  return 1;

        return 2;
    }
}