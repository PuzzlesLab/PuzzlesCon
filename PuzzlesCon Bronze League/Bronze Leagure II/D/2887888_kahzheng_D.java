
import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static int[] array = new int[65000];

    public static void main(String[] args) {
//        sieve();
//
//        Scanner s = new Scanner(System.in);
//        for (int num = 3; num < 65000; num++) {
//            if (num == 0) {
//                break;
//            }
//
//            if (fermat(num) && array[num] == 2) {
//                System.out.println(num);
//            }
//        }
        
        //list all precomputed result
        array[561] = 1;
        array[1105] = 1;
        array[1729] = 1;
        array[2465] = 1;
        array[2821] = 1;
        array[6601] = 1;
        array[8911] = 1;
        array[10585] = 1;
        array[15841] = 1;
        array[29341] = 1;
        array[41041] = 1;
        array[46657] = 1;
        array[52633] = 1;
        array[62745] = 1;
        array[63973] = 1;  
        
        
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int temp = s.nextInt();
            if (temp == 0) {
                break;
            }
            if (array[temp] == 1) {
                System.out.println("The number " + temp + " is a Carmichael number.");
            } else {
                System.out.println(temp + " is normal.");
            }
        }
    }

    public static void sieve() {
        for (int i = 2; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else {
                continue;
            }
            for (int j = i; j < array.length; j += i) {
                if (array[j] == 0) {
                    array[j] = 2;
                }
            }
        }
    }

    public static boolean fermat(int num) {
        BigInteger temp = new BigInteger(Integer.toString(num));
        Random r = new Random();

        for (int a = 0; a < num; a++) {

            BigInteger a1 = new BigInteger(Integer.toString(a));
            a1 = a1.pow(num);

            a1 = a1.mod(temp);
            if (!a1.equals(new BigInteger(Integer.toString(a)))) {
                return false;
            }

        }

        return true;
    }
}
