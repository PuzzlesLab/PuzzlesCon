import java.io.IOException;
import java.util.Scanner;

class Main {
	
	public static int sumOfMultiples (int n) {
		if (n==1) return 0;
		
		int sum=1;
		for (int i=2;i<Math.sqrt(n);i++) {
			if (n%i==0) sum+=(n/i + i);
		}
		int sqrt=(int)Math.sqrt(n);
		if (sqrt*sqrt==n) sum+=sqrt;
		return sum;
	}
	
	public static void main (String [] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		String blankSpace="     ";
		System.out.println("PERFECTION OUTPUT");
		while (sc.hasNextInt()) {
			int n=sc.nextInt();
			if (n==0) break;
			
			int som=sumOfMultiples(n);
			int digitsCount=(int)Math.log10(n)+1;
			
			System.out.print(blankSpace.substring(0,5-digitsCount));
			if (som==n) System.out.println(n+"  PERFECT");
			else if (som<n) System.out.println(n+"  DEFICIENT");
			else if (som>n) System.out.println(n+"  ABUNDANT");
		}
		System.out.println("END OF OUTPUT");
	}
	
}