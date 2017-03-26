import java.util.*;
import java.io.*;

public class Main{
	
	public static void main(String args[]) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String s = br.readLine().toLowerCase();
		String a = "qwertyuiop[]asdfghjkl;'zxcvbnm,.";

		int temp=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)!=' '){
				for(int j=0;j<a.length();j++){
					if(a.charAt(j)==s.charAt(i)){
						temp = j-2;
						break;
					}
				}
				sb.append(a.charAt(temp));
			}else{
				sb.append(' ');
			}
			
		}
		System.out.println(sb.toString());
	}
}