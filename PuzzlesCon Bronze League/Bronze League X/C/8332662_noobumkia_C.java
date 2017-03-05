
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
   
     Scanner s = new Scanner(System.in);
        int loop = s.nextInt();
        
        for(int i=0;i<loop;i++){
            int n1 = s.nextInt();
            int n2 = s.nextInt();
            
            n1 = n1 % 2 == 0 ? n1 + 1: n1;
            n2 = n2 % 2 == 0 ? n2 - 1: n2;
            
            int sumOfOdds = (n2+1)/2 * (n2+1)/2 - (n1-1)/2 * (n1-1)/2;
            System.out.println("Case "+(i+1)+": "+sumOfOdds);
        }
        
    }

}
