import java.io.*;

public class Main {
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s=br.readLine();
		while (s!=null) {
			String [] number=s.split(" ");
			System.out.println(Integer.parseInt(number[0])^Integer.parseInt(number[1]));
			s=br.readLine();
		}
	}
} 