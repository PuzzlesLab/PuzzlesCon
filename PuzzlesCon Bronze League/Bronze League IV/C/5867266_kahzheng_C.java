import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author KahZheng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        while(s.hasNext()){
            int count = s.nextInt();
            
            int[] array = new int[count];
            for(int i=0;i<array.length;i++){
                array[i] = s.nextInt();
            }
            
            System.out.println("Minimum exchange operations : "+BubbleSort(array));
            
        }
    }
 
    public static int BubbleSort( int [ ] num )
{
     int j;
     boolean flag = true;   // set flag to true to begin first pass
     int temp;   //holding variable
     int count = 0;
     while ( flag )
     {
            flag= false;    //set flag to false awaiting a possible swap
            for( j=0;  j < num.length -1;  j++ )
            {
                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
                   {
                       count++;
                           temp = num[ j ];                //swap elements
                           num[ j ] = num[ j+1 ];
                           num[ j+1 ] = temp;
                          flag = true;              //shows a swap occurred  
                  } 
            } 
      } 
     return count;
} 
    
}