
import java.util.Scanner;

class Main {

    static int array[] = new int[1000001];
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        generateCount();
        
        
        
        while(s.hasNext()){
            int a = s.nextInt();
            int b = s.nextInt();
            int max = 0;
            
            for(int i=Integer.min(a, b);i<=Integer.max(a, b);i++){
                if(array[i]>max){
                    max = array[i];
                }
            }
            
            System.out.println(a+" "+b+" "+max);
        }
    }

    private static void generateCount() {
        for(int i=1;i<=1000000;i++){
            array[i] = collatz(i);
        }
    
    }
    
    private static int collatz(int i){
       long temp = i;
       int count = 1;
       while(temp!=1){
           if(temp%2==0){
               temp/=2;
           }else{
               temp = temp*3 + 1;
           }
           count++;
       }
       return count;
    }
}
