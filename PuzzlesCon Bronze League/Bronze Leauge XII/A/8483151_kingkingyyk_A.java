import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;
import java.util.TreeMap;

class Main {

	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(br.readLine());
		TreeMap<String,HashSet<String>> map=new TreeMap<>();
		
		for (int i=0;i<count;i++) {
			String s=br.readLine();
			StringTokenizer st=new StringTokenizer(s);
			String country=st.nextToken();
			String name=s.substring(country.length());
			
			if (!map.containsKey(country)) map.put(country, new HashSet<>());
			
			map.get(country).add(name);
		}
		
		for (String s : map.keySet()) System.out.println(s+" "+map.get(s).size());
	}
	
}