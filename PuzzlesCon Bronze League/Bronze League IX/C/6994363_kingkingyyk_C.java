import java.util.Scanner;

class Main {
	
	public static void main (String [] abc) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int t=0;t<T;t++) {
			int [] n=new int [sc.nextInt()];
			for (int i=0;i<n.length;i++) n[i]=sc.nextInt();
			double avg=0;
			for (int v : n) avg+=v;
			avg/=n.length;
			double avgCount=0;
			for (int v : n) if (v>avg) avgCount++;
			
			System.out.printf("%.3f%%\n", (avgCount*100)/n.length);
		}
	}
	
}