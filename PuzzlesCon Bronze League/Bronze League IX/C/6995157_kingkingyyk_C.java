import java.util.Scanner;

class Main {
	
	public static void main (String [] abc) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int t=0;t<T;t++) {
			int [] N=new int [sc.nextInt()];
			for (int i=0;i<N.length;i++) N[i]=sc.nextInt();
			double avg=0;
			for (int n : N) avg+=n;
			avg/=N.length;
			double avgCount=0;
			for (int n : N) if (n>avg) avgCount++;
			System.out.printf("%.3f%%\n",(avgCount*100)/N.length);
		}
	}
	
}