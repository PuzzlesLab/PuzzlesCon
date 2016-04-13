import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[]args)throws IOException  {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int count=Integer.parseInt(br.readLine());
		HashMap<String,Integer> map=new HashMap<>();
		for (int i=0;i<count;i++) {
			String country=new StringTokenizer(br.readLine()).nextToken();
			if (!map.containsKey(country)) {
				map.put(country, 0);
			}
			map.put(country,map.get(country)+1);
		}
		
		Set<String> mapKeys=map.keySet();
		String [] mapKeysAry=mapKeys.toArray(new String [mapKeys.size()]);
		Arrays.sort(mapKeysAry);
		
		StringBuilder sb=new StringBuilder();
		for (int i=0;i<mapKeysAry.length;i++) {
			sb.append(mapKeysAry[i]);
			sb.append(" ");
			sb.append(map.get(mapKeysAry[i]));
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}