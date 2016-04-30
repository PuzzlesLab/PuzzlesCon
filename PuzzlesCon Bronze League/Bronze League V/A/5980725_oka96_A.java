import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static int f(int n){
        if(n>=101)
            return n-10;
        else
            return f(f(n+11));
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int n = in.nextInt();
            if(n==0)
                break;
            System.out.println("f91("+n+") = "+f(n));
        }
    }
    
}
