import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		StringTokenizer st;
		int n=Integer.parseInt(sc.nextLine());
		for (int gg=0;gg<n;gg++) {
			st=new StringTokenizer(sc.nextLine());
			int sum=Integer.parseInt(st.nextToken());
			int diff=Integer.parseInt(st.nextToken());
			if (sum<diff || (sum+diff)%2!=0) {
				System.out.println("impossible");
			} else {
				int x=(sum+diff)/2;
				int y=(sum-diff)/2;
				System.out.println(Math.max(x,y)+" "+Math.min(x,y));
			}
		}
	}
}