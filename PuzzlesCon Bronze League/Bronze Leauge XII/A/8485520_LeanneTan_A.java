import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Leanne
 */
public class Main{

    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(kb.readLine());
        String[] holdcountry = new String[input];
        for (int i = 1; i <= input; i++) {
            String girl = kb.readLine();
            String[] holdgirl = girl.split(" ");
            holdcountry[i - 1] = holdgirl[0];
        }
        sorting(holdcountry);
    }

    public static void sorting(String[] holdcountry) {
        for (int i = 0; i < holdcountry.length; i++) {
            for (int j = 0; j < holdcountry.length - 1; j++) {
                if (holdcountry[j].compareToIgnoreCase(holdcountry[j + 1]) > 0) {
                    String temp = holdcountry[j];
                    holdcountry[j] = holdcountry[j + 1];
                    holdcountry[j + 1] = temp;
                }
            }
        }
        int count = 1;
        for (int k = 0; k < holdcountry.length;) {
            for (int m = k; m < holdcountry.length - 1; m++) {
                if (holdcountry[k].equalsIgnoreCase(holdcountry[m + 1])) {
                    count = count + 1;
                }
            }
            System.out.println(holdcountry[k] + " " + count);
            k=k+count;
            count = 1;
        }
    }
}