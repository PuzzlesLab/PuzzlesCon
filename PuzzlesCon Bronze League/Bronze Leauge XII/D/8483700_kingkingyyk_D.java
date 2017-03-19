import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static int f91(int N) {
		if (N<=100) return f91(f91(N+11));
		return N-10;
	}
	
	public static void main(String[] args)  throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while ((s=br.readLine())!=null && !s.equals("0")) {
			int i=Integer.parseInt(s);
			System.out.println("f91("+i+") = "+f91(i));
		}
	}
	
}