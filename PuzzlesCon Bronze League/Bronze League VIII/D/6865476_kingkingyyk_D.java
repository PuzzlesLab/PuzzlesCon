import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0")) {
			int number=0;
			for (int i=0;i<s.length();i++) {
				number+=(s.charAt(i)-'0');
			}
			int count=1;
			while (number>10) {
				int temp=number;
				int sum=0;
				while (temp>0) {
					sum+=temp%10;
					temp/=10;
				}
				number=sum;
				count++;
			}
			if (number%9==0) {
				System.out.println(s+" is a multiple of 9 and has 9-degree "+count+".");
			} else {
				System.out.println(s+" is not a multiple of 9.");
			}
		}
	}
}