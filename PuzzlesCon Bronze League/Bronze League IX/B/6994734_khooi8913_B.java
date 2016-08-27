import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{

    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while((s=br.readLine())!=null){
            int numCase=Integer.parseInt(s);
//            System.out.println("numcase = "+numCase);
            
            for(int i=0;i<numCase;i++){
                int daySim=0;
                int numParty=0;
                int [] a;
                ArrayList b = new ArrayList();
                
                daySim = Integer.parseInt(br.readLine());
                numParty = Integer.parseInt(br.readLine());
//                System.out.println("daysim="+daySim+"numparty="+numParty);
                a = new int[numParty];
                
                for(int j=0;j<numParty;j++){
                    a[j]=Integer.parseInt(br.readLine());
//                    System.out.print(a[j]+" ");
                }
//                System.out.println("");
                
                for(int j=0;j<numParty;j++){
                    for(int k=1;k<=daySim;k++){
                        if(k%7!=0)
                            if((k+1)%7!=0)
                                if(k%a[j]==0){
                                    b.add(k);
//                                    System.out.println(k);
                                }
                    }
                }
                
                Collections.sort(b);
//                System.out.println(b.toString());
                ArrayList c = new ArrayList();
                for(int j=0;j<b.size();j++){
                    if(!c.contains(b.get(j)))
                        c.add(b.get(j));
                }
                System.out.println(c.size());
            }
        }
        
        
    }
    
}
