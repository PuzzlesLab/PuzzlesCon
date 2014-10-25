import java.util.Scanner;
import java.math.BigInteger;

public class Main {

	public static void main(String[] args)  {  
		Scanner sc=new Scanner(System.in);
		while (sc.hasNext()) {
			int num=Integer.parseInt(sc.nextLine());
			if (num<0) {
				break;
			} else {
				//answer = (n*(n+1)/2) + 1
				BigInteger n=new BigInteger(String.valueOf(num));
				BigInteger nAddOne=n.add(BigInteger.ONE);
				BigInteger divideTwo=n.multiply(nAddOne).divide(new BigInteger("2"));
				BigInteger answer=divideTwo.add(BigInteger.ONE);
				System.out.println(answer.toString());
			}
		}
	}  
}