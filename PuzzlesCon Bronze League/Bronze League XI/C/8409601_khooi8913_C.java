import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pr = new PrintWriter(System.out);
        int numCases = Integer.parseInt(br.readLine());
        for(int z=0; z<numCases; z++){
            StringBuilder sb = new StringBuilder();
            br.readLine();
            int amp = Integer.parseInt(br.readLine());
            int f = Integer.parseInt(br.readLine());
            
            for(int _f=0;_f<f;_f++){
                for(int i=1;i<=amp;i++){
                    for(int k=0;k<i;k++){
                        sb.append(i);
                    }
                    sb.append("\n");
                }
                for(int i=amp-1;i>0;i--){
                    for(int k=0;k<i;k++){
                        sb.append(i);
                    }
                    sb.append("\n");
                }
                if(_f!=f-1){
                    sb.append("\n");
                }
            }
            if(z!=numCases-1){
                pr.println(sb.toString());
            }else{
                pr.print(sb.toString());
            }
        }
        pr.close();
    }
    
}
