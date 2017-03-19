import java.util.Scanner;

/**
 *
 * @author Leanne
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int input = kb.nextInt();
        while (input != 0) {
            System.out.println("f91(" + input + ")" + " = " + f91(input));
            input = kb.nextInt();
        }
    }

    public static int f91(int N) {
        if (N >= 101) {
            return N - 10;
        } else {
            return f91(f91(N + 11));
        }

    }
}
