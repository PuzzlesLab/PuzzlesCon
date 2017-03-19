import java.util.*;
import java.io.*;

public class Main{

	public static void main(String args[]) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pr = new PrintWriter(System.out);

		String s;
		while(!(s=br.readLine()).equals("0")){
			int n = Integer.parseInt(s);
			pr.println("f91("+n+") = "+f91(n));
		}
		pr.close();
	}

	public static int f91 (int n){
		if(n<=100)	return f91(f91(n+11));
		else return	n-10;
	}
}