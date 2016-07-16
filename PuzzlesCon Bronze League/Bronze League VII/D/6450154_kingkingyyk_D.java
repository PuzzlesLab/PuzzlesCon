import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (true) {
			s=br.readLine();
			StringTokenizer st=new StringTokenizer(s);
			int [] v=new int [4];
			for (int i=0;i<4;i++) {
				v[i]=Integer.parseInt(st.nextToken());
			}
			
			if (v[0]==0 && v[1]==0 && v[2]==0 && v[3]==0) {
				break;
			}
			
			if(v[2]<v[0]) {
				v[2]+=24;
			}
			if (v[2]==v[0] && v[1]>v[3]) {
				v[2]+=24;
			}
			
			int t1=v[0]*60+v[1];
			int t2=v[2]*60+v[3];
			System.out.println(t2-t1);
		}
	}
}