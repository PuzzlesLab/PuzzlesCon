import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static int f91 (int n) {
		if (n<=100) {
			return f91(f91(n+11));
		}
		return n-10;
	}
	
	public static void main(String[]args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0")) {
			int value=Integer.parseInt(s);
			System.out.println("f91("+value+") = "+f91(value));
		}
	}
}