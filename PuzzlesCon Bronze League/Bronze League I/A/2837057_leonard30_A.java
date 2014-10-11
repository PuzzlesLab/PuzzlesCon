import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        while(input.hasNextLine()){
            double n = Double.parseDouble(input.nextLine());
            double p = Double.parseDouble(input.nextLine());
            double answer = Math.pow(p, 1.0/n);
            double x = answer - (int)answer;
            if(x >=0.5){
            System.out.println((int)(answer+1));
            }
            else{
            System.out.println((int)(answer));
            }
            }
        
        
    }
}