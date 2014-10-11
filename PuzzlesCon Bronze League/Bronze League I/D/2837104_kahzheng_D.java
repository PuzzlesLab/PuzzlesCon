
import java.util.Scanner;

public class Main {

    static int[][] array = new int[101][5];
    public static void main(String[] args) throws Exception {

        precompute();
       Scanner s = new Scanner(System.in);
       int temp=0;
       do{
        temp = s.nextInt();
        if(temp==0){
            break;
        }else{
            System.out.print(temp+": ");
            System.out.print(array[temp][0]+" i, ");
            System.out.print(array[temp][1]+" v, ");
            System.out.print(array[temp][2]+" x, ");
            System.out.print(array[temp][3]+" l, ");
            System.out.print(array[temp][4]+" c");
            System.out.println();
        }
       }while(temp!=0);

       
    }

    static void precompute(){
        for(int i=1;i<101;i++){
            int ones = i%10;
            int nines = 0;
            switch (ones){
                case 0:
                    
                    array[i][0] = array[i-1][0];
                    array[i][1] = array[i-1][1];
                    break;
                case 1:
                    array[i][0] = array[i-1][0]+1;
                    array[i][1] = array[i-1][1];
                    break;
                    
                case 2:
                    array[i][0] = array[i-1][0]+2;
                    array[i][1] = array[i-1][1];
                    break;
                    
                case 3:
                    array[i][0] = array[i-1][0]+3;
                    array[i][1] = array[i-1][1];
                    break;
                    
                    
                case 4:
                    array[i][0] = array[i-1][0]+1;
                    array[i][1] = array[i-1][1]+1;
                    break;
                    
                    
                case 5:
                    array[i][0] = array[i-1][0];
                    array[i][1] = array[i-1][1]+1;
                    break;
                    
                    
                case 6:
                    array[i][0] = array[i-1][0]+1;
                    array[i][1] = array[i-1][1]+1;
                    break;
                    
                    
                case 7:
                    array[i][0] = array[i-1][0]+2;
                    array[i][1] = array[i-1][1]+1;
                    break;
                    
                    
                case 8:
                    array[i][0] = array[i-1][0]+3;
                    array[i][1] = array[i-1][1]+1;
                    break;
                    
                    
                case 9:
                    array[i][0] = array[i-1][0]+1;
                    array[i][1] = array[i-1][1];
                    nines = 1;
                    break;
            }
            
            int tens = (i/10)%10;
            int ninty = 0;
            switch (tens){
                case 0:
                    
                    array[i][2] = array[i-1][2];
                    array[i][3] = array[i-1][3];
                    break;
                    
                case 1:
                    array[i][2] = array[i-1][2]+1;
                    array[i][3] = array[i-1][3];
                    break;
                    
                case 2:
                    array[i][2] = array[i-1][2]+2;
                    array[i][3] = array[i-1][3];
                    break;
                    
                case 3:
                    array[i][2] = array[i-1][2]+3;
                    array[i][3] = array[i-1][3];
                    break;
                    
                    
                case 4:
                    array[i][2] = array[i-1][2]+1;
                    array[i][3] = array[i-1][3]+1;
                    break;
                    
                    
                case 5:
                    array[i][2] = array[i-1][2];
                    array[i][3] = array[i-1][3]+1;
                    break;
                    
                    
                case 6:
                    array[i][2] = array[i-1][2]+1;
                    array[i][3] = array[i-1][3]+1;
                    break;
                    
                    
                case 7:
                    array[i][2] = array[i-1][2]+2;
                    array[i][3] = array[i-1][3]+1;
                    break;
                    
                    
                case 8:
                    array[i][2] = array[i-1][2]+3;
                    array[i][3] = array[i-1][3]+1;
                    break;
                    
                    
                case 9:
                    array[i][2] = array[i-1][2]+1;
                    array[i][3] = array[i-1][3];
                    ninty = 1;
                    break;
            }
            int hundred = i/100;
            array[i][4] = array[i-1][4] + hundred + ninty;
            array[i][2] += nines;
        }
    }
   
}
