import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

class Main {
	
	public static char [] mirror=new char [128];
	
	public static boolean isPalindrome(String s) {
		char [] c=s.toCharArray();
		for (int i=0;i<c.length;i++) if (c[i]!=c[c.length-i-1]) return false;
		return true;
	}
	
	public static boolean isMirror(String s) {
		char [] c=s.toCharArray();
		for (int i=0;i<c.length;i++) if (c[i]==0 || mirror[c[i]]!=c[c.length-i-1]) return false;
		return true;
	}
	
	public static void setupMirror() {
		String charSet=	  "AEHILJMOSTUVWXYZ12358";
		String mirrorSet= "A3HIJLMO2TUVWXY51SEZ8";
		
		char [] c1=charSet.toCharArray();
		char [] c2=mirrorSet.toCharArray();
		
		for (int i=0;i<c1.length;i++) mirror[c1[i]]=c2[i];
	}
	
	public static void main(String[] args)  throws Exception {
		setupMirror();
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			boolean f1=isPalindrome(s);
			boolean f2=isMirror(s);
			
			System.out.print(s);
			if (f1 && f2) System.out.println(" -- is a mirrored palindrome.");
			else if (f1) System.out.println(" -- is a regular palindrome.");
			else if (f2) System.out.println(" -- is a mirrored string.");
			else System.out.println(" -- is not a palindrome.");
			
			System.out.println();
		}
	}
	
}