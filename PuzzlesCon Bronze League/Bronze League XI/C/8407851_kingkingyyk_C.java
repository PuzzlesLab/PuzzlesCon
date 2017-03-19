import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	public static void main (String [] args) throws IOException {
		String [] line={"","1","22","333","4444","55555","666666","7777777","88888888","999999999"};
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			br.readLine(); //empty space.
			
			int amp=Integer.parseInt(br.readLine());
			int freq=Integer.parseInt(br.readLine());
			
			StringBuilder oneWave=new StringBuilder();
			for (int i=1;i<=amp;i++) {
				oneWave.append(line[i]);
				oneWave.append("\n");
			}
			for (int i=amp-1;i>0;i--) {
				oneWave.append(line[i]);
				oneWave.append("\n");
			}
			
			StringBuilder multiWave=new StringBuilder();
			for (int i=0;i<freq;i++) {
				multiWave.append(oneWave);
				multiWave.append("\n");
			}
			
			if (testCase==testCaseCount-1) multiWave.deleteCharAt(multiWave.length()-1);
			
			System.out.print(multiWave.toString());
		}
	}
	
}