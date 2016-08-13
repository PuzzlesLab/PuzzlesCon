import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner br = new Scanner(System.in);
        int testCases = Integer.parseInt(br.nextLine());
        for(int i=0;i<testCases;i++){
            int starting = Integer.parseInt(br.nextLine());
            int ending = Integer.parseInt(br.nextLine());
            
            if(starting%2==0)
                starting++;
            
            int sum=0;
            
            for(int j=starting;j<=ending;j+=2){
                sum+=j;
            }
            
            System.out.println("Case "+ (i+1)+": "+sum);
        }
    }
    
}