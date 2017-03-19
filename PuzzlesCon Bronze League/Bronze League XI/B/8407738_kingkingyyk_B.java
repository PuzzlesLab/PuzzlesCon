import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {

	public static void main (String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		ArrayList<char []> ary=new ArrayList<>();
		String s;
		
		while ((s=br.readLine())!=null) ary.add(s.replaceAll("\t", "").toCharArray());
		
		int maxColumn=ary.stream().map(c -> c.length).max(Integer::compare).get();
		
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<maxColumn;i++) {
			for (int i2=ary.size()-1;i2>=0;i2--) {
				char [] c=ary.get(i2);
				if (i<c.length) sb.append(ary.get(i2)[i]);
				else sb.append(" ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
	
}