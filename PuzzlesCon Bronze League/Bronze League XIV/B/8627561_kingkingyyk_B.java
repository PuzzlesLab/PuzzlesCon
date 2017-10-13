import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;

class Main {
	
	public static int [] factors={2,3,5,7};
	public static HashSet<Long> humbleNumberSet=new HashSet<>();
	public static ArrayList<Long> humbleNumber=new ArrayList<>();
	
	public static void bfs () {
		PriorityQueue<Long> queue=new PriorityQueue<>();
		queue.add(1L);
		
		while (humbleNumber.size()<5843) {
			long n=queue.poll();
			if (!humbleNumberSet.contains(n)) {
				humbleNumberSet.add(n);
				humbleNumber.add(n);
				for (int f : factors) queue.offer(n*f);
			}
		}
	}
	
	public static String nToStr (int n) {
		if (n%100>=10 && n%100<=20) return n+"th";
		else {
			switch (n%10) {
				case 1 : return n+"st";
				case 2 : return n+"nd";
				case 3 : return n+"rd";
			}
		}
		return n+"th";
	}
	
	public static void main(String[] args)  throws Exception {
		bfs();

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String s;
		while (!(s=br.readLine()).equals("0")) {
			int n=Integer.parseInt(s);
			System.out.println("The "+nToStr(n)+" humble number is "+humbleNumber.get(n-1)+".");
		}
	}
	
}
