import java.util.*;
import java.io.*;

public class Main{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList <StringBuilder> pr = new ArrayList<>();
		Stack<String> wtf = new Stack<String>();
		int i=0;
		int max=0;
		String s;
		
		while((s=br.readLine())!=null){
			wtf.push(s);
			max = Math.max(max, s.length());
			i++;
		}
		
		for(int j=0;j<max;j++)	pr.add(new StringBuilder());
		

		for(int j=0;j<i;j++){
			for(int k=0;k<max;k++){
				if(k<wtf.peek().length())	pr.get(k).append(wtf.peek().charAt(k));
				else	pr.get(k).append(" ");
			}
			wtf.pop();
		}
		for(int j=0;j<max;j++)	System.out.println(pr.get(j).toString());;
	}
}