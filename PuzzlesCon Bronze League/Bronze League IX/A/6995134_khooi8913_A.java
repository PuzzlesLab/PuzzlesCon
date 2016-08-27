import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException {

        Scanner sn = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        int numCase=1;
        while(true){
            long A = sn.nextLong();
            long __A =A;
            long L = sn.nextLong();
            if(A<0 && L<0)
                break;
            
            int i=1;
            while(A<=L){
                if(A==1)
                    break;
                
                else if(A%2==0){
                    A=A/2;
                }
                else{
                    A=(3*A)+1;
                }
                
                if(A<=L)
                    i++;
            }
            pw.printf("Case %d: A = %d, limit = %d, number of terms = %d\n",numCase,__A,L,i);
            numCase++;
        }
        pw.close();
    }
    
}
