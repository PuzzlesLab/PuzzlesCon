import java.io.*;
import java.util.*;

public class Main {
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s;
		while((s=br.readLine())!=null && !s.equals("#")){
			ArrayList<String []> city = new ArrayList<>();
			do{
				String [] vote = s.split(",");
				Arrays.sort(vote);
				city.add(vote);
			}while((s=br.readLine()).charAt(0)!='e');
			
			int [] voteCount = new int[city.size()];
			for(int i=0;i<voteCount.length;i++){
				for(int j=0;j<voteCount.length;j++){
					for(int k=0;k<5;k++){
						if(city.get(i)[k].equals(city.get(j)[k]))	voteCount[i]++;
					}					
				}
			}
			
			int max = 0;
			int index=0;
			for(int i=0;i<voteCount.length;i++){
				if(voteCount[i]>max){
					index=i;
					max = voteCount[i];
				}	
			}
			System.out.println(index+1);
		}
	}
}