import java.util.Scanner;

public class Main {
	
	public static char [] m;
	
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		m=new char[128];
		m['A']='A';
		 m['E']='3';
		 m['H']='H';
		 m['I']='I';
		 m['J']='L';
		 m['L']='J';
		 m['M']='M';
		 m['O']='O';
		 m['S']='2';
		 m['T']='T';
		 m['U']='U';
		 m['V']='V';
		 m['W']='W';
		 m['X']='X';
		 m['Y']='Y';
		 m['Z']='5';
		 m['1']='1';
		 m['2']='S';
		 m['3']='E';
		 m['5']='Z';
		 m['8']='8';
		while (sc.hasNextLine()) {
			String s=sc.nextLine();
			String pzz="";
			String mzz="";
			String toDisplay="";
			for (int i=s.length()-1;i>=0;i--) {
				pzz=pzz+s.charAt(i);
				mzz=mzz+m[s.charAt(i)];
			}
			boolean palindrome=s.equals(pzz);
			boolean mirror=s.equals(mzz);
			if (!palindrome && !mirror) {
				toDisplay=s+" -- is not a palindrome.\n";
			} else if (palindrome && !mirror) {
				toDisplay=s+" -- is a regular palindrome.\n";
			} else if (!palindrome && mirror) {
				toDisplay=s+" -- is a mirrored string.\n";
			} else {
				toDisplay=s+" -- is a mirrored palindrome.\n";
			}
			System.out.println(toDisplay);
		}
	}
}