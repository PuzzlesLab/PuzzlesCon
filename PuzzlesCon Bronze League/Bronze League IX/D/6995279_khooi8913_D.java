import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner sn = new Scanner(System.in);
        while(true){
            int length = sn.nextInt();
            if(length==0)
                break;
            int numPattern = fibonacci(length);
            
            System.out.println(numPattern);
        }
    }
    
    public static int fibonacci(int length){
        if(length<=1)
            return 1;
        else{
            return (fibonacci(length-2) + fibonacci(length-1));
        }
    }
}
