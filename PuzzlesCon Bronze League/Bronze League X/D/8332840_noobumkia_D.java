
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("PERFECTION OUTPUT");
        while (true) {
            double n = s.nextInt();
            if (n == 0) {
                System.out.println("END OF OUTPUT");
                return;
            }else if(n == 1){
                System.out.printf("%5d  DEFICIENT\n", (int) n);
                continue;
            }

            int sumOfFactor = 1;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n / i % 1 == 0) {
                    sumOfFactor += i;
                    sumOfFactor += n / i;
                }
            }

            if (sumOfFactor == n) {
                System.out.printf("%5d  PERFECT\n", (int) n);
            } else if (sumOfFactor < n) {
                System.out.printf("%5d  DEFICIENT\n", (int) n);
            } else {
                System.out.printf("%5d  ABUNDANT\n", (int) n);
            }

        }

    }

}
