class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int cnt = 0,i=0;
        if(ruleKey.equals("type")) i=0;
        else if(ruleKey.equals("color")) i=1;
        else i=2;
        for(List<String> item : items)
        {
            if(ruleValue.equals(item.get(i))) cnt++;
        }
        return cnt;
    }
}