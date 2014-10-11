
import java.util.Scanner;




public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        int caseNum = input.nextInt();
        for(int i=0; i<caseNum; i++){
            
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            
            if(num2>num1){
                System.out.println("impossible");
                continue;
            }
            
            double ans1 = num1/2.0;
            double ans2 = ans1;
            ans1 += num2/2.0;
            double x = ans1 - (int)ans1;
            if(x != 0.0){
                System.out.println("impossible");
                continue;
            }
            ans2 -= num2/2;
            
            System.out.print((int)ans1 + " ");
            System.out.println((int)ans2);
            
        }
    }
}
