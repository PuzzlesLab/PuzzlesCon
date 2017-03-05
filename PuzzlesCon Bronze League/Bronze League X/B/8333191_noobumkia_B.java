
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while(s.hasNext()){
            int val = s.nextInt();
            int v = 0;
                    
            for(int i=1;;i++) {
                v = (v * 10 + 1) % val;
                if(v==0){
                    System.out.println(i);
                    break;
                }
            }            
            
        }

    }

}
