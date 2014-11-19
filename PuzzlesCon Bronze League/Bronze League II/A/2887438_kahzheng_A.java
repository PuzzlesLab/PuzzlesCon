
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean flag = true;
        ArrayList<String> list = new ArrayList();
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
            list.add(ans);
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
//        Scanner s = new Scanner(System.in);
//        int num = 0;
//        do{
//            num = s.nextInt();
//            if(num<0){
//                break;
//            }
//            int ans = num*(num+1)/2+1;
//            System.out.println(ans);
//        }while(num>=0);
    }

}
