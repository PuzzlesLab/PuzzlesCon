import java.util.*;
import java.io.*;

public class Main {
    public static int SOD(String s){
        int sod = 0;
        for(int i=0;i<s.length();i++){
            sod += s.charAt(i)-'0';
        }
        return sod;
    }
    
    public static int SOD(int n){
        int sod = 0;
        while(n!=0){
            sod += n%10;
            n /= 10;
        }
        return sod;
    }
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while(!(s=br.readLine()).equals("0")){
            int degree = 0;
            int sod = SOD(s);
            if(sod%9==0){
                while(sod!=9){
                    sod = SOD(sod);
                    degree++;
                }
                if(sod==9){
                    degree++;
                }
            }
            
            if(degree>0){    
                System.out.println(s+" is a multiple of 9 and has 9-degree "+degree+".");
            }else{
                System.out.println(s+" is not a multiple of 9.");
            }
        }
    }
    
}