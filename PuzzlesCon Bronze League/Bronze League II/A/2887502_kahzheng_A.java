

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
       
        while (s.hasNext()) {
            String ans = "";
            char[] temp = s.nextLine().toCharArray();
       
            for(int i=0;i<temp.length;i++){
                if(temp[i]=='"'){
                    if(flag==true){
                        ans+='`';
                        ans+='`';
                        
                    }else{
                        ans+='\'';
                        ans+='\'';
                    }
                    flag = !flag;
                }else{
                    ans+=temp[i];
                }
            }
            System.out.println(ans);
        }
        
               
    }

}
