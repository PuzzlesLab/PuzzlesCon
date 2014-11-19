import java.io.*;
import java.util.Arrays;

public class Main {
	
	public static class Occurrence implements Comparable<Occurrence> {
		int ascii;
		int value;
		
		@Override
		public int compareTo (Occurrence o) {
			if (this.value!=o.value) {
				return this.value-o.value;
			} else {
				return o.ascii-this.ascii;
			}
		}
	}
	
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		String toDisplay="";
		while (s!=null) {
			Occurrence [] occurrence=new Occurrence[128];
			for (int i=0;i<128;i++) {
				occurrence[i]=new Occurrence();
				occurrence[i].ascii=i;
			}
			for (char c:s.toCharArray()) {
				occurrence[c].value++;
			}
			Arrays.sort(occurrence);
			for (int i=0;i<128;i++) {
				if (occurrence[i].value>0) {
					toDisplay=toDisplay+occurrence[i].ascii+" "+occurrence[i].value+"\n";
				}
			}
			toDisplay+="\n";
			s=br.readLine();
		}
		System.out.print(toDisplay.substring(0,toDisplay.length()-1));
	}
} 