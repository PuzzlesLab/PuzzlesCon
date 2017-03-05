import java.util.*;
import java.io.*;

public class Main{

	public static void main(String args[]) throws IOException {
		
		Scanner sn = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		sb.append("PERFECTION OUTPUT\n");
		
		int input;
		int sum;
		while((input=sn.nextInt())!=0){
			sum=0;
			for(int j=1;j<input;j++){
				if(input%j==0)	sum+=j;
			}
			if(sum==input)		sb.append(String.format("%5d  PERFECT\n", input));
			else if (sum<input)	sb.append(String.format("%5d  DEFICIENT\n", input));
			else				sb.append(String.format("%5d  ABUNDANT\n", input));
		}
		
		sb.append("END OF OUTPUT\n");
		System.out.print(sb.toString());
	}

}