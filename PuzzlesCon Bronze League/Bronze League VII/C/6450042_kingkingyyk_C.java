import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			int v=Integer.parseInt(br.readLine());
			v=((((((((v*567)/9)+7492)*235)/47)-498)/10)%10);
			System.out.println(Math.abs(v));
		}
	}
}