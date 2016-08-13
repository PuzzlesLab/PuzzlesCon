import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=0;testCase<testCaseCount;testCase++) {
			int trainC=Integer.parseInt(br.readLine());
			StringTokenizer st=new StringTokenizer(br.readLine());
			int swapCount=0;
			if (trainC==0) {
				swapCount=0;
			} else {
				int [] ints=new int [trainC];
				for (int i=0;i<ints.length;i++) {
					ints[i]=Integer.parseInt(st.nextToken());
				}
				for (int i=0;i<ints.length-1;i++) {
					for (int i2=i+1;i2<ints.length;i2++) {
						if (ints[i]>ints[i2]) {
							int temp=ints[i];
							ints[i]=ints[i2];
							ints[i2]=temp;
							swapCount++;
						}
					}
				}
			}
			System.out.println("Optimal train swapping takes "+swapCount+" swaps.");
		}
	}
}