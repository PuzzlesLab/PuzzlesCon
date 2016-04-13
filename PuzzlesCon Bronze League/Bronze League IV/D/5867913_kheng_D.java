import java.io.*;
import java.util.*;
class Main{

    public static void main(String[] args)throws IOException {
        String s;
        int x,sum,empty,renew;
        ArrayList<Integer> all =new ArrayList<Integer>();
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while((s=br.readLine())!=null){
            x=Integer.parseInt(s);
            sum=x;
            empty=x;
            do{
            renew=empty/3;
            sum+=renew;
            empty=empty%3;
            empty+=renew;
            }while(empty>=3);
            if(empty==2){
                sum+=1;
            }
            all.add(sum);
        }
        for (int i = 0; i < all.size(); i++) {
            System.out.println(all.get(i));
        }
    }
    
}