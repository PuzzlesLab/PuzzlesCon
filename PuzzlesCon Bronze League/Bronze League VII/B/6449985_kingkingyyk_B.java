import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(s);
			
			StringBuilder sb=new StringBuilder();
			while (st.hasMoreTokens()) {
				char [] c=st.nextToken().toCharArray();
				for (int i=c.length-1;i>=0;i--) {
					sb.append(c[i]);
				}
				sb.append(" ");
			}
			
			String disp=sb.toString();
			disp=disp.substring(0, disp.length()-1);
			System.out.println(disp);
		}
	}
}