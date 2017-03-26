import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

class Main {
	
	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while ((s=br.readLine())!=null && !s.equals("0 0")) {
			String [] split=s.split(" ");
			if (split[0].length()>1) split[0]=split[0].substring(split[0].length()-1);
			
			BigInteger m=new BigInteger(split[0]);
			BigInteger n=new BigInteger(split[1]);
			
			int [] cycleValue=new int [10];
			int cycleValueSize=0;
			if (!n.equals(BigInteger.ZERO)) {
				int cycleDigit=m.intValue();
				boolean [] visited=new boolean[10];
				while (!visited[cycleDigit]) {
					cycleValue[cycleValueSize++]=cycleDigit;
					visited[cycleDigit]=true;
					cycleDigit=(cycleDigit*m.intValue())%10;
				}
				n=n.subtract(BigInteger.ONE).mod(BigInteger.valueOf(cycleValueSize));
			} else {
				if (m.equals(BigInteger.ZERO)) cycleValue[0]=0;
				else cycleValue[0]=1;
			}
			
			System.out.println(cycleValue[n.intValue()]);
		}
	}
	
}
