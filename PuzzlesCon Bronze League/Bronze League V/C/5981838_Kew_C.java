import java.util.Scanner;
public class Main
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);		
		int nCase=Integer.valueOf(kb.nextLine());
		String[]temp=new String[nCase];
		for(int i=0;i<nCase;i++)
		{			
			temp[i]=kb.nextLine();
		}

		for(int i=0;i<temp.length;i++)
		{
			System.out.println("Case "+(i+1)+": "+ ans(temp[i]));
		}

	}

	public static int ans(String n)
	{
		String[]split=n.split(" ");
		int temp=Integer.valueOf(split[0]);
		int max=0;
		for(int i=0;i<temp;i++)
		{
			if(max<Integer.valueOf(split[i+1]))
			{
				max=Integer.valueOf(split[i+1]);
			}
		}

		return max;
	}
}