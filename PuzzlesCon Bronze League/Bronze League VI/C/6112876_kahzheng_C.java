
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        int cases = s.nextInt();
        
        for(int i=0;i<cases;i++){
            int poles = s.nextInt();
            int init= 0;
                    
            int up = 0;
            int down = 0;
            if(poles!=0){
                 init = s.nextInt();
            }
            
            for(int j=1;j<poles;j++){
                int newPole = s.nextInt();
                if(newPole>init){
                    up++;
                }else if(newPole<init){
                    down++;
                }
                init = newPole;
            }
            
            System.out.println("Case "+(i+1)+": "+up+" "+down);
        }
    }
}