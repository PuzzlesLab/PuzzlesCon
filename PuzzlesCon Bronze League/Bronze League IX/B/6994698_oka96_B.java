import java.util.*;
import java.io.*;

public class Main{
     
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i=1;i<=T;i++){
            int N = in.nextInt();
            int P = in.nextInt();
            int h[] = new int[P];
            boolean day[] = new boolean[N+1];
            int lost = 0;
            for(int j=0;j<P;j++){
                int c = 0;
                h[j] = in.nextInt();
                for(int k=1;k<=N/h[j]&&h[j]!=0;k++){
                    c += h[j];
                    day[c] = true;
                }
            }
            for(int j=1;j<=N;j++){
                if(!(j%7==0||j%7==6)){
                    if(day[j]){
                        lost++;
                    }
                }                                   
            }
            System.out.println(lost);
        }
    }
    
}
