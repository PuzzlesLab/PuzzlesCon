import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	public static void main(String[] args)  throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			int N=Integer.parseInt(br.readLine());
			int P=Integer.parseInt(br.readLine());
			int [] h=new int [P];
			for (int i=0;i<P;i++) {
				h[i]=Integer.parseInt(br.readLine());
			}
			
			// 0 = sat, 1 = sun, ... 6 = friday
			int daysCount=0;
			for (int i=1;i<=N;i++) {
				if (i%7!=6 && i%7!=0) {
					for (int i2=0;i2<h.length;i2++) {
						if (i%h[i2]==0) {
							daysCount++;
							break;
						}
					}
				} 
			}
			System.out.println(daysCount);
		}
	}    
}