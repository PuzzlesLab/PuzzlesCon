
import java.util.Scanner;

public class Main {

    static char[] array = new char[128];
    public static void main(String[] args) throws Exception {

////        
//        array['A'] = 'A';
//        array['B'] = '~';
//        array['C'] = '~';
//        array['D'] = '~';
//        array['E'] = '3';
//        array['F'] = '~';
//        array['G'] = '~';
//        array['H'] = 'H';
//        array['I'] = 'I';
//        array['J'] = 'L';
//        array['K'] = '~';
//        array['L'] = 'J';
//        
//        array['M'] = 'M';
//        array['N'] = '~';
//        array['O'] = 'O';
//        array['P'] = '~';
//        array['Q'] = '~';
//        array['R'] = '~';
//        array['S'] = '2';
//        array['T'] = 'T';
//        array['U'] = 'U';
//        array['V'] = 'V';
//        array['W'] = 'W';
//        array['X'] = 'X';
//            
//        array['Y'] = 'Y';
//        array['Z'] = '5';
//        array['1'] = '1';
//        array['2'] = 'S';
//        array['3'] = 'E';
//        array['4'] = '~';
//        array['5'] = 'Z';
//        array['6'] = '~';
//        array['7'] = '~';
//        array['8'] = '8';
//        array['9'] = '~';
//        

        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            double n = s.nextInt();
            double p = s.nextDouble();
            System.out.println(Math.round(Math.pow(p, 1/n)));
                    
        }
        
    }

    

//    
//    public static boolean palindrome(String a){
//        char[] temp = a.toCharArray();
//        for(int i=0;i<a.length()/2;i++){
//            if(temp[i]!=temp[a.length()-i-1]){
//                return false;
//            }
//        }
//        return true;
//    }
//    
//    
//    public static boolean mirror(String a){
//        char[] temp = a.toCharArray();
//        for(int i=0;i<a.length()/2;i++){
//            if(temp[i]!=array[temp[a.length()-i-1]]){
//                return false;
//            }
//        }
//        return true;
//    }
//    
}
