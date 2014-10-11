import java.util.Scanner;

public class Main {
	static int dp[][] = new int[1000][1000];
	private static Scanner k = new Scanner(System.in);

	public static void main(String[] args) {
		Scanner k = new Scanner (System.in);
		int n = k.nextInt();
		for (int i=0;i<n;i++) {
			int a = k.nextInt();
			int b= k.nextInt();
			if (b>a) {
				System.out.println("impossible");
			} else {
				boolean flag=false;
				for (int p=0;p<=a;p++) {
					for (int q=0;q<=a;q++) {
						if (p+q==a) {
							if (p-q==b ||q-p==b) {
								if(p>q) {
								System.out.println (p+" "+q);
								} else {
									System.out.println (q+" "+p);
								}
								flag=true;
								break;
							}
						}
						if (flag) {
							break;
						}
					}	
				}
				if (!flag) {
					System.out.println("impossible");
				}
			}
		}
		}
		// int n = k.nextInt();
		// for (int i=0;i<n;i++) {
		// int a = k.nextInt();
		// int b=k.nextInt();
		// int x=0;
		// for (int q=a;q<=b;q++) {
		// int sum=0;
		// if(!prime(q)) {
		// char c[] = Integer.toString(q).toCharArray();
		// for (int v=0;v<c.length;v++) {
		// sum+=Character.getNumericValue(c[v]);
		// }
		// if(!prime(sum)) {
		// x++;
		// }
		// }
		// }
		// System.out.println(x);
		// }
		//

	

	public static boolean prime(int a) {
		boolean flag = false;
		for (int i = a; i > 0; i--) {
			if (i != a && i != 1) {
				if (a % i == 0) {
					flag = true;
					break;
				}
			}
		}
		return flag;
	}

	public static int compute() {
		int a = k.nextInt();
		int b = k.nextInt();
		int c = k.nextInt();
		int d = k.nextInt();
		if (a != 0 && c != 0) {
			return b + d;
		} else if (a == 0 && c == 0) {
			return compute() + compute();
		} else if (a == 0) {
			return compute() + d;
		} else {
			return compute() + b;
		}
	}

	public static int lcs(String s, String t) {
		int m = s.length(), n = t.length();
		if (m == 0 || n == 0)
			return 0;
		for (int i = 0; i <= m; ++i)
			dp[i][0] = 0;
		for (int j = 1; j <= n; ++j)
			dp[0][j] = 0;
		for (int i = 0; i < m; ++i)
			for (int j = 0; j < n; ++j){
				if (s.charAt(i) == t.charAt(j)) {
					dp[i + 1][j + 1] = dp[i][j] + 1;
				}
				else {
					if (dp[i + 1][j]>dp[i][j + 1]) {
						dp[i + 1][j + 1]=dp[i + 1][j];
					} else {
						dp[i + 1][j + 1] =dp[i][j + 1];
					}
				}
			}
		return dp[m][n];
	}

}
