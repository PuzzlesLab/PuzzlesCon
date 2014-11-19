
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner s = new Scanner(System.in);
//        boolean flag = true;
//        ArrayList<String> list = new ArrayList();
//        while (s.hasNext()) {
//            String ans = "";
//            char[] temp = s.nextLine().toCharArray();
//       
//            for(int i=0;i<temp.length;i++){
//                if(temp[i]=='"'){
//                    if(flag==true){
//                        ans+='`';
//                        ans+='`';
//                        
//                    }else{
//                        ans+='\'';
//                        ans+='\'';
//                    }
//                    flag = !flag;
//                }else{
//                    ans+=temp[i];
//                }
//            }
//            list.add(ans);
//        }
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
        Scanner s = new Scanner(System.in);
        int num = 0;
        do{
            num = s.nextInt();
            if(num<0){
                break;
            }
            BigInteger ans = new BigInteger(Integer.toString(num));
            BigInteger ans2 = new BigInteger(Integer.toString(num+1));
            ans = ans.multiply(ans2);
            ans = ans.divide(new BigInteger("2"));
            ans = ans.add(new BigInteger("1"));
                  
            System.out.println(ans.toString());
        }while(num>=0);
    }

}
