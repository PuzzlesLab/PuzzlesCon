import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static int findAns (int n, int r) {
		/* 	n! = 1 x 2 x 3 x 4 x .... x n
			log10(n!) = log(1) + log(2) + log10(3) + ... + log10(n)
			n!/(n-r)! = log(r) + log(r+1) + .. log(n)
		*/
		double log10=0;
		if (n-r<r) r=n-r;
		
		for (int i=n-r+1;i<=n;i++) log10+=Math.log10(i);
		for (int i=1;i<=r;i++) log10-=Math.log10(i);

		return (int)(log10+1);
	}
	
	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		StringBuilder sb=new StringBuilder();
		while ((s=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(s);
			int n=Integer.parseInt(st.nextToken());
			int r=Integer.parseInt(st.nextToken());
			
			sb.append(findAns(n,r));
			sb.append('\n');
		}
		System.out.print(sb.toString());
	}
	
}