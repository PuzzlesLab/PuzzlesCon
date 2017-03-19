import java.util.*;
import java.io.*;

public class Main{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);
		StringBuilder sb = new StringBuilder();

		int numCases=Integer.parseInt(br.readLine());

		for(int i=0;i<numCases;i++){
			br.readLine();
			int height = Integer.parseInt(br.readLine());
			int printNum = Integer.parseInt(br.readLine());

			do{
				for(int j=1;j<=height;j++){
					for(int k=0;k<j;k++){
						sb.append(j);
					}
					sb.append("\n");
				}

				for(int j=height-1;j>0;j--){
					for(int k=0;k<j;k++){
						sb.append(j);
					}
					sb.append("\n");
				}

				if(--printNum!=0)	sb.append("\n");
			}while(printNum>0);
			if((i+1)!=numCases)	sb.append("\n");
		}
		pr.print(sb.toString());
		pr.close();
	}
}