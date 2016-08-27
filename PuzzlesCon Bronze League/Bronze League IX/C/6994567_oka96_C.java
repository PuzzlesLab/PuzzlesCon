import java.util.*;
import java.io.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int C = in.nextInt();
        for(int i=1;i<=C;i++){
            int N = in.nextInt();
            int mark[] = new int[N];
            double total = 0;
            for(int j=0;j<N;j++){
                mark[j] = in.nextInt();
                total += mark[j];
            }
            double ave = total/N;
            int count = 0;
            for(int j=0;j<N;j++){
                if(mark[j]>ave){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n",(double)count/N*100);
            
        }
    }
    
}