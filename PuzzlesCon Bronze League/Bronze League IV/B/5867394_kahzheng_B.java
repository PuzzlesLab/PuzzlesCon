import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author KahZheng
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner s = new Scanner(System.in);
        int numOfLine = s.nextInt();
        s.nextLine();
        String[] array = new String[numOfLine];
        
        for(int i=0;i<array.length;i++){
            array[i] = s.next();
            s.nextLine();
        }
        
        Arrays.sort(array);
        
        String temp = array[0];
        int count = 0;
        for(int i=0;i<array.length;i++){
            if(temp.equalsIgnoreCase(array[i])){
                count++;
            }else{
                System.out.println(array[i-1]+" "+count);
                count = 1;
                temp = array[i];
            }
        }
        System.out.println(array[array.length-1]+" "+count);
        
    }
}
