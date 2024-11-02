public class Maximum69Number
{
    class Solution
    {
        public int maximum69Number (int num)
        {
            String c = Integer.toString(num);
            c=c.replaceFirst("6","9");
            num=Integer.parseInt(c);
            return num;
        }
    }
}
