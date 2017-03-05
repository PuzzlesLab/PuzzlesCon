import java.util.Scanner;
class Main {

	public static void main(String[] args) {
		int count=0,n=0;
	    int[] num = new int[1000];
		Scanner k = new Scanner(System.in);
		 do{n = k.nextInt(); }
		 while(n<1 || n>1000);
		
     do{
    	 num[count]= k.nextInt();
    	 count++;
     }
     while(count<(n*2));
     int i =0;
     int j =1;
     do{
    	 int sum =0;
    	 int m = num[i];
    	 do{
         if(m%2!=0) sum+=m;
         m++;
         }while(m<=num[i+1]);
    	 System.out.println("Case "+j+": "+sum);
    	 j++;
    	 i= i+2;
     }while(i<(n*2));
    	 
     }
	}