import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner br = new Scanner(System.in);
        int testCase = Integer.parseInt(br.nextLine());
        
        for(int i=0;i<testCase;i++){
            int swapCount=0;
            int numCarriage = Integer.parseInt(br.nextLine());
            if(numCarriage==0){
                System.out.println("Optimal train swapping takes 0 swaps.");
                br.nextLine();
            }
            else{
                String carriages = br.nextLine();
                String[] _carriages = carriages.split(" ");
                int[] _IntCarriages = new int[_carriages.length];

                for(int j=0;j<_IntCarriages.length;j++){
                    _IntCarriages[j]= Integer.parseInt(_carriages[j]);
                }

                for(int k=0;k<_IntCarriages.length;k++){
                    for(int j=0;j<_IntCarriages.length-1;j++){
                        if(_IntCarriages[j]>_IntCarriages[j+1]){
                            int temp = _IntCarriages[j+1];
                            _IntCarriages[j+1] = _IntCarriages[j];
                            _IntCarriages[j]=temp;
                            swapCount++;
                        }    
                    }
                }

                System.out.println("Optimal train swapping takes "+swapCount+" swaps.");
            }
            
            
           
        }
    }
    
}
