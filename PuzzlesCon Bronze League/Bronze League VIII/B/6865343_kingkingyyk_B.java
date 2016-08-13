import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0 0")) {
			StringTokenizer st=new StringTokenizer(s);
			String s1=st.nextToken();
			int [] i1=new int [11];
			int temp=0;
			for (int i=s1.length()-1;i>=0;i--) {
				i1[temp++]=s1.charAt(i)-'0';
			}
			
			String s2=st.nextToken();
			int [] i2=new int [11];
			temp=0;
			for (int i=s2.length()-1;i>=0;i--) {
				i2[temp++]=s2.charAt(i)-'0';
			}
			
			int [] result=new int [11];
			int carryC=0;
			for (int i=0;i<10;i++) {
				result[i]+=(i1[i]+i2[i]);
				if (result[i]>=10) {
					result[i]%=10;
					result[i+1]=1;
					carryC++;
				}
			}
			if (carryC==0) {
				System.out.println("No carry operation.");
			} else if (carryC==1) {
				System.out.println("1 carry operation.");
			} else {
				System.out.println(carryC+ " carry operations.");
			}

		}
	}
}