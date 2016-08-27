import java.util.*;
import java.io.*;

public class Main {
    public static int count = 0;
    public static int n(int A,int L){
        if(A==1){
            count++;
        }
        if(A<=L&&A>1){
            if(A%2==0){
                A /= 2;
                count++;
                return n(A,L);
            }else{
                A = 3*A+1;
                count++;
                return n(A,L);
            }
        }
        return count;
    }
    public static void main(String[] args)throws IOException{
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        int line = 0;
        while((s=br.readLine())!=null&&!s.isEmpty()){
            line++;
            StringTokenizer st = new StringTokenizer(s);
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if(a<0&&b<0){
                break;
            }
            count=0;
            System.out.printf("Case %d: A = %d, limit = %d, number of terms = %d\n",line,a,b,n(a,b));
        }
        
    }
    
}
