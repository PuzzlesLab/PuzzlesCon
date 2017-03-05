import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main{

	public static void main(String args[]) throws IOException {
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			BigInteger n = new BigInteger(s);
			BigInteger i = BigInteger.ONE;
			while(true){
				if(i.mod(n).equals(BigInteger.ZERO))	break;
				i = i.multiply(new BigInteger("10")).add(BigInteger.ONE);
			}
			System.out.println(i.toString().length());
		}
	}
}