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
            int sum = 0;
            sum += count;
            
            while(count >= 3){
                int extra =  count / 3;                
                sum += extra;
                count = count % 3 + extra;
            }
            
            if(count == 2){
                sum ++;
            }
            
            System.out.println(sum);
        }
    }
}
