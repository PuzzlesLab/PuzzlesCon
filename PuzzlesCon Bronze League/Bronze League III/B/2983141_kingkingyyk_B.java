import java.io.*;

public class Main {
	
	public static void main (String [] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases=Integer.parseInt(br.readLine());
		for (int i=0;i<testCases;i++) {
			char [] c=br.readLine().toCharArray();
			char [] charStack=new char [128];
			int stackCount=0;
			boolean flag=true;
			for (int i2=0;i2<c.length;i2++) {
				if (c[i2]=='(' || c[i2]=='[') {
					charStack[stackCount++]=c[i2];
				} else {
					if (stackCount==0) {
						flag=false;
						break;
					} else {
						if ((c[i2]==')' && charStack[stackCount-1]=='(') || (c[i2]==']' && charStack[stackCount-1]=='[')) {
							stackCount--;
						} else {
							flag=false;
							break;
						}
					}
				}
			}
			if (stackCount!=0) {
				flag=false;
			}
			if (flag) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
} 