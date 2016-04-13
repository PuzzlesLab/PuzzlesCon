import java.util.*;
import java.io.*;
import java.math.BigInteger;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            BigInteger a = new BigInteger(in.next());
            BigInteger b = new BigInteger(in.next());
            System.out.println(a.multiply(b));
        }
    }
    
}
