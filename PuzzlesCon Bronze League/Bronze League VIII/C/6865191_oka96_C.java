import java.util.*;
import java.io.*;

public class Main{
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for(int i=1;i<=T;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int sum = 0;
            for(int j=a;j<=b;j++){
                if((j-1)%2==0){
                    sum += j;
                }
            }
            System.out.printf("Case %d: %d\n",i,sum);
        }
        
    }
    
}