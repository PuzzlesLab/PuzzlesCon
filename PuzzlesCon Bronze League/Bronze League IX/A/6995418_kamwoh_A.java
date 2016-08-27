
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int count = 1;
        while(true)
        {
            int a = read.nextInt();
            int l = read.nextInt();
            if(a<0||l<0)
                break;
            int terms = compute(a, l, 1);
            output(count, a, l, terms);
            count++;
        }
    }

    public static int compute(int a, int l, int terms)
    {
        if (a > l)
            return terms - 1;
        if (a == 1)
            return terms;
        else if (a % 2 == 0)
            return compute(a / 2, l, terms + 1);
        else
        {
            int result = 3*a+1;
            if(result<0)
                return terms;
            return compute(result, l, terms + 1);
        }
    }

    public static void output(int count, int a, int l, int terms)
    {
        System.out.println("Case " + count + ": A = " + a + ", limit = " + l + ", number of terms = " + terms);
    }

}
