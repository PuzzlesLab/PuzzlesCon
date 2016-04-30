import java.util.*;
import java.io.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=1;i<=n;i++){
            int t = in.nextInt();
            int data [] = new int[t];
            int min = Integer.MAX_VALUE;
            for(int j=0;j<t;j++)
                data[j] = in.nextInt();            
            for(int j=0;j<t;j++){
                int sum = 0;
                for(int k=0;k<t;k++){
                    sum += Math.abs(data[j]-data[k]);
                }
                if(min>sum)
                    min = sum;
            }
            System.out.println(min);
        }
    }
    
}