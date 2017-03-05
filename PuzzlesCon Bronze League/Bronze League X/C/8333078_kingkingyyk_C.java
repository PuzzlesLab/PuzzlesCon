import java.io.IOException;
import java.util.Scanner;

class Main {

	public static void main (String [] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		int testCaseCount=sc.nextInt();
		for (int testCase=1;testCase<=testCaseCount;testCase++) {
			int a=sc.nextInt();
			if (a%2==0) a++;
			int b=sc.nextInt();
			if (b%2==0) b--;
			
			int sum=0;
			for (int i=Math.min(a,b);i<=Math.max(a,b);i+=2) sum+=i;
			System.out.println("Case "+testCase+": "+sum);
		}
	}
	
}