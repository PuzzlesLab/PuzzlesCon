import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=1;testCase<=testCaseCount;testCase++) {
			int a=Integer.parseInt(br.readLine());
			int b=Integer.parseInt(br.readLine());
			if (a%2==0) a++;
			if (b%2==0) b--;
			int sum=0;
			for (int i=a;i<=b;i+=2) {
				sum+=i;
			}
			System.out.println("Case "+testCase+": "+sum);
		}
	}
}