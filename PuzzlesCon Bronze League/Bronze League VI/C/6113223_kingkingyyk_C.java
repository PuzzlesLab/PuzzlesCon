import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=1;testCase<=testCaseCount;testCase++) {
			int count=Integer.parseInt(br.readLine());
			int [] values=new int [count];
			StringTokenizer st=new StringTokenizer(br.readLine());
			for (int i=0;i<count;i++) {
				values[i]=Integer.parseInt(st.nextToken());
			}
			
			int highCount=0;
			int lowCount=0;
			for (int i=1;i<count;i++) {
				if (values[i]>values[i-1]) {
					highCount++;
				} else if (values[i]<values[i-1]) {
					lowCount++;
				}
			}
			
			System.out.println("Case "+testCase+": "+highCount+" "+lowCount);
		}
	}
	
}