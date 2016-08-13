import java.util.Scanner;

 class Main{
 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);
  int cases = in.nextInt();

   while(cases-- > 0 ){
   
   int length = in.nextInt();
   int carriages[] =  new int[length];
   
   for(int i = 0 ; i < length ; ++i)
   {
    carriages[i] =  in.nextInt();
   }
   
   int swaps = 0 ;
   
   for(int  i = 0 ; i < length ; ++i)
   {
    for( int  j = i -1 ; (j>=0 && carriages[j+1] < carriages[j]) ; --j ) 
    {

     carriages[j+1] ^= carriages[j] ;
        carriages[j]  ^=   carriages[j+1] ;
        carriages[j+1] ^= carriages[j] ;
         
     ++swaps;
    }
   }
   System.out.println("Optimal train swapping takes " +swaps +" swaps.");
   
  }
  
  in.close();
  
 }
}