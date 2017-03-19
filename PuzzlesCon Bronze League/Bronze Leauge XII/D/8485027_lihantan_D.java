import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n;
        Scanner in = new Scanner (System.in);
        n = in.nextInt();
        while(n!=0){
            System.out.println("f91("+n+") = "+F(n));
            n=in.nextInt();
        }
    }
    public static int F(int n){
        int x;
        if (n<=100){
            x=F(F(n+11));
        }
        else
            x=n-10;
        return x;
    }
}
