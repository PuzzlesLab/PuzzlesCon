import java.util.*;
import java.io.*;

public class Main{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		StringTokenizer st;
		String country;
		int numCases = Integer.parseInt(br.readLine());
		
		ArrayList<String> a = new ArrayList<>();
		HashMap<String, Integer> b = new HashMap<>();

		for(int i=0;i<numCases;i++){
			st = new StringTokenizer(br.readLine());
			country = st.nextToken();
			if(!a.contains(country)){
				a.add(country);
				b.put(country, 1);
			}else{
				b.put(country, b.get(country)+1);
			}
		}
		
		Collections.sort(a);
		for(int j=0;j<a.size();j++){
			pr.println(a.get(j)+" "+b.get(a.get(j)));
		}
		pr.close();
	}
}