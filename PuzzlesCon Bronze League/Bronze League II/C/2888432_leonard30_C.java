
import java.util.Scanner;



class Main{
    public static void main(String [] args){
        
        
        
        
        Scanner input = new Scanner(System.in);
        while(input.hasNext()){
            int num = input.nextInt();
            if(num<0){
                break;
            }
            else{
                long sum = 1;
                for(int i=1; i<=num; i++){
                    sum+=i;
                }
                System.out.println(sum);
            }
        }
        
    }
}
