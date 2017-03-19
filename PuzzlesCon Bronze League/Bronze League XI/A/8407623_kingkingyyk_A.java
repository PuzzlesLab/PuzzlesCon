import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {

	public static void main (String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0")) {
			int n=Integer.parseInt(s);
			int count=0;
			for (int i=2;i<=n/2;i++) {
				BigInteger p1=BigInteger.valueOf(n-i);
				BigInteger p2=BigInteger.valueOf(i);
				
				if (p1.isProbablePrime(10) && p2.isProbablePrime(10)) count++;
				if (i>2) i++;
			}
			
			System.out.println(count);
		}
	}
	
}