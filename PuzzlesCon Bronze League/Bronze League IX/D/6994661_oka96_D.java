import java.util.*;
import java.io.*;
public class Main {         
    
    public static void main(String[] args)throws IOException{   
        Scanner in = new Scanner(System.in);
        int n = 0;
        int g[] = new int[51];
        g[1] = 1;
        g[2] = 2;
        g[3] = 3;
        for(int j=4;j<=50;j++){
            g[j] = g[j-1]+g[j-2];
        }
        
        while((n=in.nextInt())!=0){
            System.out.println(g[n]);
        }
    }
}
