
import java.util.Scanner;


public class Main{

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        while(true)
        {
            int n = read.nextInt();
            if(n==0)
                break;
            System.out.println("f91("+n+") = "+f91(n));
        }
    }
    
    public static int f91(int n)
    {
        if(n<=100)
        {
            return f91(f91(n+11));
        }
        else
            return n-10;
    }
    
}
