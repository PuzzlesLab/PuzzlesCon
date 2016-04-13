import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author gwjeugene94
 */
public class Main {
    
        public static void main(String[] args) throws IOException {
           
       BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer count;
		int time = Integer.parseInt(read.readLine());
		for (int i = 0 ; i < time ; i++){
			String line = read.readLine();
			line = line.split(" ")[0];
			count = map.get(line);
			if (count == null){
				map.put(line , 1);
			}else{
				map.put(line , count+=1);
			}
		}
		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);
		int num;
		for (String country: list){
			num = map.get(country);
			System.out.println(country + " " + num);
		}
        
       
    }
    
}
