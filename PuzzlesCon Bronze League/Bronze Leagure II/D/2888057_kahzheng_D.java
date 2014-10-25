
import java.util.Scanner;

public class Main {

    static int[] array = new int[65000];

    public static void main(String[] args) {

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

    
}
