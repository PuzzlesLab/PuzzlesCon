import java.util.*;
import java.io.*;

public class Main{

    public static void main(String args[]) throws IOException {
        int numCases=0, a=0, b=0, sum;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   
        numCases = Integer.parseInt(br.readLine());
        for(int i=0;i<numCases;i++){
            sum=0;
            a=Integer.parseInt(br.readLine());
            b=Integer.parseInt(br.readLine());
            if(a%2==0)  ++a;
            if(b%2==0)  --b;
            for(int j=a;j<=b;j+=2){
                sum+=j;
            }
            System.out.printf("Case %d: %d\n",i+1,sum);
        }
    }

}