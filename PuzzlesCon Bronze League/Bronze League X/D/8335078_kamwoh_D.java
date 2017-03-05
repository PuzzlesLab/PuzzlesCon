import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		Scanner read = new Scanner(System.in);
		int number;
		System.out.println("PERFECTION OUTPUT");
		while((number=read.nextInt())!=0)
		{
			System.out.printf("%5s  "+getAns(number)+"\n",number);
		}
		System.out.println("END OF OUTPUT");
	}

	public static String getAns(int number)
	{
		long total = 0;
		for(int i=1;i<=(int)(number/2);i++)
		{
			if(number%i==0)
				total += i;
		}
		if(total==number)
			return "PERFECT";
		else if(total>number)
			return "ABUNDANT";
		else
			return "DEFICIENT";
	}
}