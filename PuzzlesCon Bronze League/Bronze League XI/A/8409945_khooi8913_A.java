import java.util.*;
import java.io.*;
import java.math.*;

public class Main{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while(!(s=br.readLine()).equals("0")){
			int n = Integer.parseInt(s);
			int count=0;
			for(int i=2;i<=n/2;i++){
				BigInteger x = new BigInteger((i)+"");
				BigInteger y = new BigInteger((n-i)+"");
				if(x.isProbablePrime(10)&&y.isProbablePrime(10))	count++;
				if(i>2)	i++;
			}
			System.out.println(count);
		}

	}
}