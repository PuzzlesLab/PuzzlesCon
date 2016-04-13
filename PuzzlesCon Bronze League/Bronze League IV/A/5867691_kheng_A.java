import java.util.*;
import java.math.*;
import java.io.*;
class Main{

    public static void main(String[] args)throws IOException {
        BigInteger x,y,multiply;
        ArrayList<BigInteger> all=new ArrayList<BigInteger>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int testcase=0;
        String s;
        while((s=br.readLine())!=null){
            x=new BigInteger(s);
            y=new BigInteger(br.readLine());
            multiply=x.multiply(y);
            all.add(multiply);
            
        }
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
        
    }
    
}