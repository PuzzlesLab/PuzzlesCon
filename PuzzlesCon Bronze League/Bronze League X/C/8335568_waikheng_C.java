import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     */
    public static void main(String[] args) throws ParseException {
Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        String[]arr = new String[num];
        for (int i=0; i<num; i++){
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            arr[i] = ("Case "+(i+1)+": "+summation(n1,n2));
        }
        for (String k:arr){
            System.out.println(k);
        }
    }  
    public static int summation (int a, int b){
        int sum = 0;
        for (int i=a; i<=b; i++){
            if (i%2!=0){
                sum += i;
            }
        }
        return sum;
    }
}
