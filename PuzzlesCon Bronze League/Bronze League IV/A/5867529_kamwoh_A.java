
import java.math.BigInteger;
import java.util.Scanner;


public class Main {

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        BigInteger x, y, ans;
        
        while(read.hasNext())
        {
            String s = read.nextLine();
            String s1 = read.nextLine();
            x = new BigInteger(s);
            y = new BigInteger(s1);
            ans = x.multiply(y);
            System.out.println(ans);
        }
    }
    
}
