import java.io.*;
import java.util.*;
public class Main {
    
    public static int max(int n){
        if(n==1)
            return 1;
        return (int)(((double)n/2)*3);
    }
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()){
            int b = in.nextInt();
            System.out.println(max(b));
        }
        
    }
    
}
