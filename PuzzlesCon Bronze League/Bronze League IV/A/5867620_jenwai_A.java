
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str=br.readLine())!=null){
			BigInteger bi = new BigInteger(str);
			BigInteger bi2 = new BigInteger(br.readLine());
			BigInteger bi3 =  bi.multiply(bi2);
			System.out.println(bi3);
		}
		
		
	}

}