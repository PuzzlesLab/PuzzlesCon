import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static int [] cache=new int [500000];
	
	public static int cycleCount (int n) {
		if (n==1) {
			return 1;
		}
		if (n%2==1) {
			if (n<cache.length) {
				if (cache[n]==0) {
					cache[n]=1+cycleCount(3*n+1);
				}
				return cache[n];
			} else {
				return 1+cycleCount(3*n+1);
			}
		} else {
			if (n<cache.length) {
				if (cache[n]==0) {
					cache[n]=1+cycleCount(n/2);
				}
				return cache[n];
			} else {
				return 1+cycleCount(n/2);
			}
		}
	}
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(s);
			int min=Integer.parseInt(st.nextToken());
			int max=Integer.parseInt(st.nextToken());
			
			int maxCycle=0;
			for (int i=Math.min(min,max);i<=Math.max(min, max);i++) {
				maxCycle=Math.max(maxCycle, cycleCount(i));
			}
			System.out.println(min+" "+max+" "+maxCycle);
		}
	}
	
}