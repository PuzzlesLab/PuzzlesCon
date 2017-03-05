import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int x = in.nextInt();
            boolean flag = true;
            int n = 1, l = 1;
            while(n % x > 0){
                n = n % x * 10 + 1;
                l++;
            }
            System.out.println(l);
        }
    }
    
}