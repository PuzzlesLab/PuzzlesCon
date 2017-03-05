import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        String k;
        k = in.next();
        n = Integer.parseInt(k);
        System.out.println("PERFECTION OUTPUT");
        while (n != 0) {
            int z, l = 0;
            String x;
            for (int i = 1; i <= n / 2; i++) {
                if (n % i == 0) {
                    z = i;
                    l = l + z;

                }
            }

            if (l == n) {

                x = "  PERFECT";
            } else if (l < n) {
                x = "  DEFICIENT";
            } else {
                x = "  ABUNDANT";
            }
            if(k.length()==1){
                System.out.print("    "+k);
            }
            else if(k.length()==2){
                System.out.print("   "+k);
            }
            
            else if(k.length()==3){
                System.out.print("  "+k);
            }
            
            else if(k.length()==4){
                System.out.print(" "+k);
            }
            else{
                System.out.print(k);
            }
            
            System.out.println(x);
            k = in.next();
            n = Integer.parseInt(k);
        }
        System.out.println("END OF OUTPUT");
    }
}
