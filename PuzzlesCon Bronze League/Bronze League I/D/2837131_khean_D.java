import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner k = new Scanner (System.in);
		while (true) {
			int n =k.nextInt();
			if (n==0) {
				break;
			} else {
				int ii=0, v=0, x=0, l=0,c=0;
				for (int i=1;i<=n;i++) {
					int a = i;
					int ten = a/10;
					int digit = a%10;
					switch (ten) {
					case 1:
						x++;
						break;
					case 2:
						x+=2;
						break;
					case 3:
						x+=3;
						break;
					case 4:
						x++;
						l++;
						break;
					case 5:
						l++;
						break;
					case 6:
						l++;
						x++;
						break;
					case 7:
						l++;
						x+=2;
						break;
					case 8:
						l++;
						x+=3;
						break;
					case 9:
						x++;
						c++;
						break;
							
					}
					switch (digit) {
					case 1:
						ii++;
						break;
					case 2:
						ii+=2;
						break;
					case 3:
						ii+=3;
						break;
					case 4:
						ii++;
						v++;
						break;
					case 5:
						v++;
						break;
					case 6:
						v++;
						ii++;
						break;
					case 7:
						v++;
						ii+=2;
						break;
					case 8:
						v++;
						ii+=3;
						break;
					case 9:
						ii++;
						x++;
						break;
							
					}
				}
				System.out.println (n+": "+ii+" i, "+v+" v, "+x+" x, "+l+" l, "+c+" c");
			}
			
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
			if (x.length%2!=0 && i==x.length/2) {
				result+=x[i];
			}else if (x[i]=='E') {
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
