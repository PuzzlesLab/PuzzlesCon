import java.util.Scanner;
import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {
        int a, b, c, d,g;
        BigInteger e, f;
        Scanner in = new Scanner(System.in);
        e = in.nextBigInteger();
        f = in.nextBigInteger();
      

        while (!e.equals(BigInteger.ZERO)|| !f.equals(BigInteger.ZERO)) {
            d = e.remainder(BigInteger.TEN).intValue();
            b = f.remainder(BigInteger.valueOf(100)).intValue();
              a = d % 10;
            c = b % 4;
            if(f.equals(BigInteger.ZERO)){
                System.out.println("1");
            }
          
            else if (a == 0) {
                System.out.println("0");
            } else if (a == 1 ) {
                System.out.println("1");
            } else if (a == 2) {
                switch (c) {
                    case 0:
                        System.out.println("6");
                        break;
                    case 1:
                        System.out.println("2");
                        break;
                    case 2:
                        System.out.println("4");
                        break;
                    default:
                        System.out.println("8");
                        break;
                }
            } else if (a == 3) {
                switch (c) {
                    case 0:
                        System.out.println("1");
                        break;
                    case 1:
                        System.out.println("3");
                        break;
                    case 2:
                        System.out.println("9");
                        break;
                    default:
                        System.out.println("7");
                        break;
                }
            } else if (a == 4) {
                switch (c) {
                    case 0:
                        System.out.println("6");
                        break;
                    case 1:
                        System.out.println("4");
                        break;
                    case 2:
                        System.out.println("6");
                        break;
                    default:
                        System.out.println("4");
                        break;
                }
            } else if (a == 5) {
                System.out.println("5");

            } else if (a == 6) {
                System.out.println("6");
            } else if (a == 7) {
                switch (c) {
                    case 0:
                        System.out.println("1");
                        break;
                    case 1:
                        System.out.println("7");
                        break;
                    case 2:
                        System.out.println("9");
                        break;
                    default:
                        System.out.println("3");
                        break;
                }
            } else if (a == 8) {
                switch (c) {
                    case 0:
                        System.out.println("6");
                        break;
                    case 1:
                        System.out.println("8");
                        break;
                    case 2:
                        System.out.println("4");
                        break;
                    default:
                        System.out.println("2");
                        break;
                }

            } else {
                switch (c) {
                    case 0:
                        System.out.println("1");
                        break;
                    case 1:
                        System.out.println("9");
                        break;
                    case 2:
                        System.out.println("1");
                        break;
                    default:
                        System.out.println("9");
                        break;
                }
            }
            e = in.nextBigInteger();
            f = in.nextBigInteger();
          

        }
    }
}
