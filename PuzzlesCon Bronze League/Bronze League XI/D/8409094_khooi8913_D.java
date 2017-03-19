import java.util.*;
import java.io.*;

public class Main{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			long x = Long.parseLong(s);
			x = ((x*x)*(x+1)*(x+1))/4;
			System.out.println(x);
		}

	}

}