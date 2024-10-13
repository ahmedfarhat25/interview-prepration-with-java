import java.util.Arrays;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        int []nums=new int[10];
        int cnt=0;
        for(int i=0;i<nums.length;++i)
        {
            String s=String.valueOf(nums[i]);
            if(s.length()%2==0) cnt++;
            else continue;
        }
        System.out.println(cnt);

    }
}