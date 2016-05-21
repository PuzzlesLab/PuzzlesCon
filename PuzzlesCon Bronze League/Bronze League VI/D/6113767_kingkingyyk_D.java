import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
	
	public static boolean [] notPrime=new boolean [3000000];
	public static int [] primeNumbers=new int [notPrime.length/2];
	public static int primeNumbersCount=0;
	
	public static void sieveOfEratothenes () {
		for (int i=2;i*i<notPrime.length;i++) {
			if (!notPrime[i]) {
				for (int i2=i*i;i2<notPrime.length;i2+=i) {
					notPrime[i2]=true;
				}
			}
		}
		
		for (int i=2;i<notPrime.length;i++) {
			if (!notPrime[i]) {
				primeNumbers[primeNumbersCount++]=i;
			}
		}
	}
	
	public static int sumOfDigits (int n) {
		int sum=0;
		while (n>0) {
			sum+=n%10;
			n/=10;
		}
		return sum;
	}
	
	public static boolean isPrime(int n) {
		if (n<notPrime.length) {
			return !notPrime[n];
		}
		for (int i=0;primeNumbers[i]*primeNumbers[i]<=n && i<primeNumbersCount;i++) {
			if (n%primeNumbers[i]==0) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isSmithNumber (int n) {
		if (isPrime(n)) {
			return false;
		}
		int sumOfDigitsN=sumOfDigits(n);
		int temp=n;
		int sumOfPrimeFactors=0;
		for (int i=0;primeNumbers[i]<=temp && i<primeNumbersCount;i++) {
			while (temp%primeNumbers[i]==0) {
				sumOfPrimeFactors+=sumOfDigits(primeNumbers[i]);
				temp/=primeNumbers[i];
			}
		}
		if (temp>1) {
			sumOfPrimeFactors+=sumOfDigits(temp);
		}
		return sumOfPrimeFactors==sumOfDigitsN;
	}
	
	public static void main (String [] abc) throws IOException {
		sieveOfEratothenes();
		isSmithNumber(10000426);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int testCaseCount=Integer.parseInt(br.readLine());
		for (int testCase=1;testCase<=testCaseCount;testCase++) {
			int n=Integer.parseInt(br.readLine());
			while (!isSmithNumber(++n)) {};
			System.out.println(n);
		}
	}
	
}