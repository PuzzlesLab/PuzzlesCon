import java.util.Scanner;
public class Main
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);
		int n=1;
		while((n=kb.nextInt())>0)
		{
			System.out.println("f91("+n+") = "+recursion(n));
		}
	}

	public static int recursion(int n)
	{
		if(n>=101)
			return n-10;
		else if(n<=100)
			return recursion(recursion(n+11));

		return 0;
	}
}


