import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=1;i<=T;i++){
            int x = in.nextInt();
            int max = in.nextInt();
            for(int j=1;j<x;j++){
                max = Math.max(max,in.nextInt());
            }
            System.out.println("Case "+i+": "+max);
        }
    }
    
}
