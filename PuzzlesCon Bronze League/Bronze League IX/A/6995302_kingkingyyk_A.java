import java.util.Scanner;

class Main {
	
	public static void main (String [] abc) {
		Scanner sc=new Scanner(System.in);
		int t=1;
		while (true) {
			int A=sc.nextInt();
			int l=sc.nextInt();
			if (A<0 && l<0) {
				break;
			}
			
			long tempA=A;
			int n=1;
			while (tempA>1) {
				if (tempA%2==0) tempA/=2;
				else tempA=3*tempA+1;
				if (tempA<=l)n++;
				else break;
			}
			
			System.out.println("Case "+t+++": A = "+A+", limit = "+l+", number of terms = "+n);
		}
	}
	
}