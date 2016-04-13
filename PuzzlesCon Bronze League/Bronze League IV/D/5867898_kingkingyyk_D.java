import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static int emptyCount=0;
	
	public static int getValue (int v) {
		int count=v;
		while (v>=1) {
			if (v%3==2) {
				if (emptyCount>0) {
					v=v+1;
					emptyCount--;
				} else {
					v=v-2;
					emptyCount+=2;
				}
			} else if (v%3==1) {
				if (emptyCount>=2) {
					v=v+2;
					emptyCount-=2;
				} else {
					v=v-1;
					emptyCount++;
				}
			}
			v/=3;
			count+=v;
		}
		return count;
	}
	
	public static void main(String[]args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			int v=Integer.parseInt(s);
			emptyCount=1;
			int sum=getValue(v);
			System.out.println(sum);
		}
	}
}