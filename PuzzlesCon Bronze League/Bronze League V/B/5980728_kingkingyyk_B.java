import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

	
	public static void main(String[]args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			StringTokenizer st=new StringTokenizer(br.readLine());
			int [] values=new int [Integer.parseInt(st.nextToken())];
			for (int i=0;i<values.length;i++) {
				values[i]=Integer.parseInt(st.nextToken());
			}
			Arrays.sort(values);
			
			int minDiff=Integer.MAX_VALUE;
			for (int i=0;i<values.length;i++) {
				int diff=0;
				for (int i2=0;i2<values.length;i2++) {
					diff+=Math.abs(values[i2]-values[i]);
				}
				minDiff=Math.min(diff, minDiff);
			}
			System.out.println(minDiff);
		}
	}
}