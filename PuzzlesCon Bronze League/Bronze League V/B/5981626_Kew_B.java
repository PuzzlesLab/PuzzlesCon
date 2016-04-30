import java.util.Scanner;
import java.util.StringTokenizer;
public class Main
{
	public static void main(String[]args)
	{
		Scanner kb=new Scanner(System.in);		
		int nCase=kb.nextInt();
		kb.nextLine();
		String[]temp=new String[nCase];

		for(int i=0;i<nCase;i++)
		{
			temp[i]=kb.nextLine();
		}

		for(int i=0;i<temp.length;i++)
		{
			System.out.println(distance(temp[i]));
		}
	}

	public static int distance(String n)
	{
		String []split=n.split(" ");
		int r=Integer.valueOf(split[0]);
		int[]street=new int[r];
		for(int i=0;i<r;i++)
		{
			street[i]=Integer.valueOf(split[i+1]);
		}

		sort(street);

		int m=street[street.length/2];

		int sum=0;
		for(int i=0;i<street.length;i++)
		{
			sum+=Math.abs((street[i]-m));
		}

		return sum;
	}

	public static void sort(int[]n)
	{
		for(int i=0;i<n.length;i++)
		{
			for(int j=1;j<n.length;j++)
			{
				if(n[j-1]>n[j])
				{
					int temp=n[j-1];
					n[j-1]=n[j];
					n[j]=temp;
				}

			}
		}		
		//display(n);
	}

	public static void display(int []n)
	{
		System.out.println("list:");
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]);
		}
		System.out.println("end of lsit");
	}
}