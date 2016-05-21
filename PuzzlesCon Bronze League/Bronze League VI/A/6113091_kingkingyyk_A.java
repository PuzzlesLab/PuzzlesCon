import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] abc) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(s);
			int [][] count=new int [3][3];
			for (int i=0;i<3;i++) {
				for (int i2=0;i2<3;i2++) {
					count[i][i2]=Integer.parseInt(st.nextToken());
				}
			}
			//brown, green, clear
			int minValue=Integer.MAX_VALUE;
			int currValue=0;
			String config="";
			//BCG
			currValue=0;
			currValue=currValue+count[1][0]+count[2][0]; //B
			currValue=currValue+count[0][2]+count[2][2]; //C
			currValue=currValue+count[0][1]+count[1][1]; //G
			if (minValue>currValue) {
				minValue=currValue;
				config="BCG "+minValue;
			}
			//BGC
			currValue=0;
			currValue=currValue+count[1][0]+count[2][0]; //B
			currValue=currValue+count[0][1]+count[2][1]; //G
			currValue=currValue+count[0][2]+count[1][2]; //C
			if (minValue>currValue) {
				minValue=currValue;
				config="BGC "+minValue;
			}
			//CBG
			currValue=0;
			currValue=currValue+count[1][2]+count[2][2]; //C
			currValue=currValue+count[0][0]+count[2][0]; //B
			currValue=currValue+count[0][1]+count[1][1]; //G
			if (minValue>currValue) {
				minValue=currValue;
				config="CBG "+minValue;
			}
			//CGB
			currValue=0;
			currValue=currValue+count[1][2]+count[2][2]; //C
			currValue=currValue+count[0][1]+count[2][1]; //G
			currValue=currValue+count[0][0]+count[1][0]; //B
			if (minValue>currValue) {
				minValue=currValue;
				config="CGB "+minValue;
			}
			//GBC
			currValue=0;
			currValue=currValue+count[1][1]+count[2][1]; //G
			currValue=currValue+count[0][0]+count[2][0]; //B
			currValue=currValue+count[0][2]+count[1][2]; //C
			if (minValue>currValue) {
				minValue=currValue;
				config="GBC "+minValue;
			}
			//GCB
			currValue=0;
			currValue=currValue+count[1][1]+count[2][1]; //G
			currValue=currValue+count[0][2]+count[2][2]; //C
			currValue=currValue+count[0][0]+count[1][0]; //B
			if (minValue>currValue) {
				minValue=currValue;
				config="GCB "+minValue;
			}
			System.out.println(config);
		}
	}
	
}