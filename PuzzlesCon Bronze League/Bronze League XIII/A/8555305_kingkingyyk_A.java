import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	
	public static void main(String[] args)  throws Exception {
		String [] strSet={"qwertyuiop[]\\","asdfghjkl;'\"","zxcvbnm,./"};
		char [] charSet=new char [128];
		for (int i=0;i<charSet.length;i++) charSet[i]=(char)i;
		
		for (int i=0;i<strSet.length;i++) for (int i2=0;i2<strSet[i].length();i2++) {
			if (i2<2) charSet[strSet[i].charAt(i2)]=strSet[i].charAt(strSet[i].length()-1-i2);
			else charSet[strSet[i].charAt(i2)]=strSet[i].charAt(i2-2);
		}
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while ((s=br.readLine())!=null) {
			StringBuilder sb=new StringBuilder();
			for (char c : s.toLowerCase().toCharArray()) sb.append(charSet[c]);
			
			System.out.println(sb.toString());
		}
	}
	
}