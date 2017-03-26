import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String s,s1;
		int a;
		s1 = "`1234567890-=qwertyuiop[]\\asdfghjkl;'zxcvbnm,./";
		while(in.hasNextLine()){
			s = in.nextLine();
			a = s.length();
			s = s.toLowerCase();
			for(int i = 0;i<a;i++ ){
				if(s.charAt(i)==' ')System.out.print(" ");
				else{
				System.out.print(s1.charAt(s1.indexOf(s.charAt(i))-2));
				}
			}
			System.out.println();
		}

	}

}