import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b,c,d,e=1;
        Scanner in =new Scanner(System.in);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        while(a!=0 || b!=0 ||c!=0||d!=0){
            int count=0;
            int x = (a*d+b)%c;
            d=x;
            do{
                
                d=(a*d+b)%c;
                count++;
            }while(x!=d);
            System.out.println("Case "+e+++": "+count);
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        d=in.nextInt();
        }
    }
}
