import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

class Main {
	
	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while ((s=br.readLine())!=null && !s.equals("#")) {
			ArrayList<String []> list=new ArrayList<>();
			do {
				String [] splitted=s.split(",");
				Arrays.sort(splitted);
				list.add(splitted);
			} while ((s=br.readLine()).charAt(0)!='e');
			
			int [] changeCount=new int [list.size()];
			for (int i=0;i<changeCount.length;i++) for (int i2=0;i2<changeCount.length;i2++) {
				for (int i3=0;i3<5;i3++) if (!list.get(i)[i3].equals(list.get(i2)[i3])) changeCount[i]++;
			}

			int lowestChangeIndex=0;
			for (int i=1;i<changeCount.length;i++) if (changeCount[i]<changeCount[lowestChangeIndex]) lowestChangeIndex=i;
			
			System.out.println(lowestChangeIndex+1);
		}
	}
	
}