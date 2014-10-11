import java.util.Scanner;

public class Main {
	
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		while (sc.hasNextLine()) {
			double n=Double.parseDouble(sc.nextLine());
			double p=Double.parseDouble(sc.nextLine());
			System.out.println(Math.round(Math.pow(10,Math.log10(p)/n)));
		}
	}
}