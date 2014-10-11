import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner (System.in);
		while (k.hasNext()) {
			String input = k.next();
			boolean p = checkP(input);
			boolean m = checkM(input);
			if (p&&m) {
				System.out.println (input+" -- is a mirrored palindrome.");
			} else if (p==true && m!=true) {
				System.out.println (input+" -- is a regular palindrome.");
			} else if (m==true && p!=true) {
				System.out.println (input+" -- is a mirrored string.");
			} else {
				System.out.println (input+" -- is not a palindrome.");
			}
			System.out.println();
		}
		
		
	}
	
	public static boolean checkP (String a) {
		char x[] = a.toCharArray();
		for (int i=0;i<a.length()/2;i++) {
			if (x[i]!=x[a.length()-i-1]) {
				return false;
			}
		}
		return true;
	}
	public static boolean checkM (String a) {
		char x[] = a.toCharArray();
		String result = "";
		for (int i=x.length-1;i>=0;i--) {
			if (x[i]=='E') {
				result +="3";
			} else if (x[i]=='J') {
				result +="L";
			}else if (x[i]=='L') {
				result +="J";
			}else if (x[i]=='S') {
				result +="2";
			}else if (x[i]=='2') {
				result +="S";
			}else if (x[i]=='Z') {
				result +="5";
			}else if (x[i]=='5') {
				result +="Z";
			}else if (x[i]=='3') {
				result +="E";
			}else if (x[i]=='H') {
				result +="H";
			}else if (x[i]=='I') {
				result +="I";
			}else if (x[i]=='A') {
				result +="A";
			}else if (x[i]=='M') {
				result +="M";
			}else if (x[i]=='T') {
				result +="T";
			}else if (x[i]=='U') {
				result +="U";
			}else if (x[i]=='V') {
				result +="V";
			}else if (x[i]=='W') {
				result +="W";
			}else if (x[i]=='X') {
				result +="X";
			}else if (x[i]=='Y') {
				result +="Y";
			}else if (x[i]=='8') {
				result +="8";
			}else if (x[i]=='O') {
				result +="O";
			}else if (x[i]=='1') {
				result +="1";
			} else {
				result +=" ";
			}
		}
		if (result.equals(a)) {
			return true;
		} else {
			return false;
		}
	}

}
