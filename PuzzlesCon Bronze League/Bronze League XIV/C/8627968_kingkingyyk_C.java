import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	
	public static boolean isCarmicheal (int n) {
		if (BigInteger.valueOf(n).isProbablePrime(10)) return false;
		
		BigInteger biN=BigInteger.valueOf(n);
		boolean flag=true;
		for (int i=2;i<n && flag;i++) {
			BigInteger f=BigInteger.valueOf(i);
			if (f.gcd(biN).equals(BigInteger.ONE)){
				flag&=(f.modPow(biN.subtract(BigInteger.ONE),biN).equals(BigInteger.ONE));
			}
		}
		return flag;
	}
	
	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0")) {
			int n=Integer.parseInt(s);
			
			if (isCarmicheal(n)) System.out.println("The number "+n+" is a Carmichael number.");
			else System.out.println(n+" is normal.");
		}
	}
	
}
