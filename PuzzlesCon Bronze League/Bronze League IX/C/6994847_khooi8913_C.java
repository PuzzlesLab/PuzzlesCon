import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            int numCases = Integer.parseInt(s);
            
            for(int i=0;i<numCases;i++){
                s = br.readLine();
                StringTokenizer st = new StringTokenizer(s);
                int []a = new int[Integer.parseInt(st.nextToken())];
                for(int j=0;j<a.length;j++){
                    a[j]=Integer.parseInt(st.nextToken());
                }
                double average;
                int sum=0;
                for(int j=0;j<a.length;j++){
                    sum+=a[j];
                }
                average = (sum*1.0)/(a.length*1.0);
                int aAverage=0;
                for(int j=0;j<a.length;j++){
                    if(a[j]>average)
                        aAverage++;
                }
                
                double aboveAve = ((aAverage*1.0)/(a.length*1.0))*100;
                System.out.printf("%.3f%s\n",aboveAve,"%");
 
            }
        }
    }
    
}
