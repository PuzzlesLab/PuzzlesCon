import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{

    public static void main(String[] args) {
        
        Scanner br = new Scanner(System.in);
        String s;
        
        while(!(s=br.nextLine()).equals("0 0")){
            StringTokenizer st= new StringTokenizer(s);
            String a = st.nextToken();
            StringBuilder _a = new StringBuilder();
            for(int i=a.length()-1;i>=0;i--){
                _a.append(a.charAt(i));
            }
            a = _a.toString();
            String b = st.nextToken();
            StringBuilder _b = new StringBuilder();
            for(int i=b.length()-1;i>=0;i--){
                _b.append(b.charAt(i));
            }
            b = _b.toString();
            
            if(a.length()<b.length()){
                String c = b;
                b = a;
                a = c;   
            }
            
            boolean carry=false;
            int carryCount =0;
            for(int i=0;i<a.length();i++){
                int sum=0;
                if(carry==true){
                    if(i>b.length()-1){
                        sum=Integer.parseInt(a.charAt(i)+"")+1;
                    }
                    else{
                        sum=Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"")+1;
                    }
                    
                    if(sum>=10){
                        carry=true;
                        carryCount++;
                    }
                    else{
                        carry=false;
                    }
                }
                else{
                    if(i>b.length()-1){
                        sum=Integer.parseInt(a.charAt(i)+"");
                    }
                    else{
                        sum=Integer.parseInt(a.charAt(i)+"")+Integer.parseInt(b.charAt(i)+"");
                    }
                    
                    if(sum>=10){
                        carry=true;
                        carryCount++;
                    }
                    else{
                        carry=false;
                    }
                }
            }
            if(carryCount==0)
                System.out.println("No carry operation.");
            else if(carryCount==1)
                System.out.println(carryCount + " carry operation.");
            else
                System.out.println(carryCount + " carry operations.");
        }
    }
    
}
