import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("PERFECTION OUTPUT");
        int x = in.nextInt();
        while(x != 0){
            int sum = 0;
            for(int j = 1; j <= x / 2; j++){
                if(x % j == 0){
                    sum += j;
                }
            }
            if(sum == x){
                System.out.printf("%5d  PERFECT\n", x);
            }
            else if(sum < x){
                System.out.printf("%5d  DEFICIENT\n", x);
            }
            else{
                System.out.printf("%5d  ABUNDANT\n", x);
            }
            x = in.nextInt();
        }
        System.out.println("END OF OUTPUT");
    }
    
}
