import javax.xml.transform.sax.SAXResult;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
public class Main
{
    public  boolean (int n)
    {
        Scanner sc = new Scanner(System.in);
        int x = n ^ (n >> 1); // Right shift, then XOR
        return (x & (x + 1)) == 0; // Check if result is zero

    }
    public static void main(String[] args)
    {
        Scanner cs = new Scanner(System.in);

    }
}