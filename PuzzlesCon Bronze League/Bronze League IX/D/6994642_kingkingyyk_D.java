import java.util.Scanner;
import java.io.*;

class Main {
	
	public static void main (String [] abc) {
		long [] dp=new long [51];
		dp[1]=1; dp[2]=2;
		for (int i=3;i<dp.length;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		Scanner sc=new Scanner(System.in);
		int n;
		while ((n=sc.nextInt())!=0) {
			System.out.println(dp[n]);
		}
	}
	
}