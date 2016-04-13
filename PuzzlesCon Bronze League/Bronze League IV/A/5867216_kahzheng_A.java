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
            String num1 = s.nextLine();
            String num2 = s.nextLine();
            
            BigInteger a = new BigInteger(num1);
            BigInteger b = new BigInteger(num2);
            
            System.out.println(a.multiply(b));
        }
    }
    
}