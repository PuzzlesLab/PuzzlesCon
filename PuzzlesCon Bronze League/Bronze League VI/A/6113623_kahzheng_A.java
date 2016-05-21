
import java.util.Scanner;

class Main {

    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int[][] array = new int[3][3];
            int[][] counted = new int[3][3];
            
            for(int i=0;i<3;i++){
                for(int j=0;j<3;j++){
                    array[i][j] = s.nextInt();
                }
            }
            
            
            
            for(int i=0;i<3;i++){
                counted[i][0] = array[i][1] + array[i][2];
                counted[i][1] = array[i][0] + array[i][2];
                counted[i][2] = array[i][0] + array[i][1];
            }
            String output = "BCG";
            int max =counted[0][0] + counted[1][2] +counted[2][1];
            int num =  counted[0][0] + counted[1][1] + counted[2][2];
            
            if(num < max){
                max = num;
                output = "BGC";
            }  
            num = counted[0][2] + counted[1][0] +counted[2][1];
            if(num < max){
                max = num;
                output = "CBG";
            }
            
            num = counted[0][2] + counted[1][1] +counted[2][0];
            if(num < max){
                max = num;
                output = "CGB";
            }
            
             num = counted[0][1] + counted[1][0] +counted[2][2];
            if(num < max){
                max = num;
                output = "GBC";
            }
             num = counted[0][1] + counted[1][2] +counted[2][0];
            if(num < max){
                max = num;
                output = "GCB";
            }
          
          
           System.out.println(output+" "+max);
            
           
            
        }
    }

}
