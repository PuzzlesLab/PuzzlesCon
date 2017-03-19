import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		String s;
		while((s=br.readLine())!=null && !s.equals("")){
			st = new StringTokenizer(s);
			int n = Integer.parseInt(st.nextToken());
			int r = Integer.parseInt(st.nextToken());
			
			double x=0;
			for(int i=n;i>=(n-r+1);i--)	x+=Math.log10(i*1.0);			
			
			double y=0;
			for(int i=r;i>0;i--)	y+=Math.log10(i*1.0);
			
			System.out.println((int)(x-y+1));
		}
	}
}