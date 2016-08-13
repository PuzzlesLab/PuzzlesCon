import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        
        for(int i=1;i<=T;i++){
            int L = in.nextInt();
            int order[] = new int[L];
            int count  = 0;
            
            for(int j=0;j<L;j++){
                order[j] = in.nextInt();
            }
            
            for(int j=0;j<L-1;j++){
                for(int k=0;k<L-j-1;k++){
                    if(order[k]>order[k+1]){
                        int tmp = order[k];
                        order[k] = order[k+1];
                        order[k+1] = tmp;
                        count++;
                    }
                }
            }
            
            System.out.printf("Optimal train swapping takes %d swaps.\n",count);
        }
        
    }
    
}
