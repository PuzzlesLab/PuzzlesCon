import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        
        while(!(s=br.readLine()).equals("0 0")){
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int carry = 0;
            int hold = 0;
            while(a!=0||b!=0){
                if(a%10+b%10+hold>9){
                    a = a/10;
                    b /= 10;
                    hold = 1;
                    carry++;
                }else{
                    a /= 10;
                    b /= 10;
                    hold = 0;
                }
            }
            if(carry==0){
                System.out.println("No carry operation.");
            }else if(carry==1){
                System.out.println("1 carry operation.");
            }else{
                System.out.println(carry+" carry operations.");
            }
        }
        
    }
    
}
