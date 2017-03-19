import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	
	public static void main (String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			/* [n^2 * (n+1)^2]/4 */
			BigInteger n=new BigInteger(s);
			BigInteger nSquare=n.multiply(n);
			BigInteger nPlusOneSquare=n.add(BigInteger.ONE);
			nPlusOneSquare=nPlusOneSquare.multiply(nPlusOneSquare);
			
			BigInteger four=new BigInteger("4");
			System.out.println(nSquare.multiply(nPlusOneSquare).divide(four));
		}
	}
	
}