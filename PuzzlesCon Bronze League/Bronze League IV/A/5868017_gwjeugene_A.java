import java.util.Scanner;
/**
 *
 * @author gwjeugene94
 */
public class Main {
    
    public static void main(String[] arg){
           
Scanner input = new Scanner(System.in);
        
        while(input.hasNext()) {  
        System.out.println(input.nextBigInteger().multiply(input.nextBigInteger()));
           }  
        
        input.close();
       
    }
    
}