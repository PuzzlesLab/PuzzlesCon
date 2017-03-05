import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int n = 1;
        while(x > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            if(b < a){
                int tmp = a;
                a = b;
                b = tmp;
            }
            if(a % 2 == 0){
                a++;
            }
            int sum = 0;
            for(int i = a; i <= b; i += 2){
                sum += i;
            }
            System.out.println("Case " + n + ": " + sum);
            x--;
            n++;
        }
    }
    
}