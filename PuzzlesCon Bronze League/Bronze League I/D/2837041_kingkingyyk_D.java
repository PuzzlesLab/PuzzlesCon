import java.util.Scanner;

public class Main {
	
	public static String romanNumGenerator(int i) {
		String s="";
		while (i>=100) {
			s=s+'c';
			i-=100;
		}
		if (i>=90) {
			s=s+"xc";
			i-=90;
		}
		while (i>=50) {
			s=s+'l';
			i-=50;
		}
		if (i>=40) {
			s=s+"xl";
			i-=40;
		}
		while (i>=10) {
			s=s+'x';
			i-=10;
		}
		if (i>=9) {
			s=s+"ix";
			i-=9;
		}
		while (i>=5) {
			s=s+'v';
			i-=5;
		}
		if (i>=4) {
			s=s+"iv";
			i-=4;
		}
		while (i>=1) {
			s=s+'i';
			i--;
		}
		return s;
	}
	
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNextLine()) {
			int i=Integer.parseInt(sc.nextLine());
			if (i==0) {
				break;
			} else {
				int [] count=new int [128];
				for (int loop=1;loop<=i;loop++) {
					String s=romanNumGenerator(loop);
					for (int charLoop=0;charLoop<s.length();charLoop++) {
						count[s.charAt(charLoop)]++;
					}
				}
				System.out.println(i+": "+count['i']+" i, "+count['v']+" v, "+count['x']+" x, "+count['l']+" l, "+count['c']+" c");
			}
		}
	}
}