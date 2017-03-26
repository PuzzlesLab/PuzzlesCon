import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.HashMap;

class Main {
	
	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		int testCase=1;
		while ((s=br.readLine())!=null && !s.equals("0 0 0 0")) {
			String [] split=s.split(" ");
			BigInteger [] data=new BigInteger [split.length];
			for (int i=0;i<split.length;i++) data[i]=new BigInteger(split[i]);
			
			HashMap<String,Integer> cyclePos=new HashMap<>();
			int currCyclePos=0;
			int cycleSize=-1;
			BigInteger lastValue=data[3];
			while (true) {
				cyclePos.put(lastValue.toString(), currCyclePos++);
				lastValue=lastValue.multiply(data[0]).add(data[1]).mod(data[2]);
				if (cyclePos.containsKey(lastValue.toString())) {
					cycleSize=currCyclePos-cyclePos.get(lastValue.toString());
					break;
				}
			}
			
			System.out.println("Case "+testCase+++": "+cycleSize);
		}
	}
	
}
