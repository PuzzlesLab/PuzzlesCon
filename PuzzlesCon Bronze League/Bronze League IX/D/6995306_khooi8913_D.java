import java.io.PrintWriter;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        while(true){
            int length = sn.nextInt();
            if(length==0)
                break;
            int numPattern = fibonacci(length);
            
            pw.println(numPattern);
        }
        pw.close();
    }
    
    public static int fibonacci(int length){
        if(length<=1)
            return 1;
        else{
            return (fibonacci(length-2) + fibonacci(length-1));
        }
    }
}
