import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main {
	
	public static void main (String [] abc) throws IOException  {
		BufferedReader read=new BufferedReader(new InputStreamReader(System.in));
		String str;
		while ((str=read.readLine())!=null) {
			StringTokenizer st=new StringTokenizer(str);
			long num1=Long.parseLong(st.nextToken());
			long num2=Long.parseLong(st.nextToken());
			if (num1==0 && num2==0) {
				break;
			}
			int counter=0;
			long Carry=0;
			
			while (num1!=0 || num2!=0) {
				long sum=num1%10+num2%10+Carry;
				Carry=sum/10;
				if (Carry>0) {
					counter++;
				}
				num1/=10;
				num2/=10;
			}
			
			
                    switch (counter) {
                        case 0:
                            System.out.println("No carry operation.");
                            break;
                        case 1:
                            System.out.println("1 carry operation.");
                            break;
                        default:
                            System.out.println(counter+" carry operations.");
                            break;
                    }
		}
	}
}