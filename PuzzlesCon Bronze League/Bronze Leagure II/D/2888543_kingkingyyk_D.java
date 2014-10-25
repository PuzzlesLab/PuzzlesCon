import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	
	public static int powermod(long base, long exponent, long modulus) {
	    if (base < 1 || exponent < 0 || modulus < 1) {
	        return -1;
		}
	    long result = 1;
	    while (exponent > 0) {
	       if ((exponent % 2) == 1) {
	           result = (result * base) % modulus;
	       }
	       base = (base * base) % modulus;
	       exponent = (long)Math.floor(exponent / 2);
	    }
	    return (int)result;
	}
	
	public static boolean isPrime (int n) {
		if (n==2 || n==3) {
			return true;
		}
		if (n<2 || n%2==0 || n%3==0) {
			return false;
		}
		for (int i=3;i*i<n+1;i+=2) {
			if (n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isCarmichael (int n) {
		if (isPrime(n)) {
			return false;
		}
    	for (int a=2;a<n;a++) {
    		if (powermod(a,n,n)!=a) {
    			return false;
    		}
    	}
    	return true;
	}
	
	public static void main(String[] args)  throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        while (n!=0) {
        	if (isCarmichael(n)) {
        		System.out.println("The number "+n+" is a Carmichael number.");
        	} else {
        		System.out.println(n+" is normal.");
        	}
            n=Integer.parseInt(br.readLine());
        }
	}  
}