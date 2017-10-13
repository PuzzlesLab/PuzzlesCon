import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String line = in.next();
            boolean m = true, p = true;
            for(int i = 0; i < line.length() / 2; i++){
                if(line.charAt(i) != line.charAt(line.length() - 1 - i)){
                    p = false;
                }
                switch(line.charAt(i)){
                    case 'E':
                        if(line.charAt(line.length() - 1 - i) != '3'){
                            m = false;
                        }
                        break;
                    case 'J':
                        if(line.charAt(line.length() - 1 - i) != 'L'){
                            m = false;
                        }
                        break;
                    case 'L':
                        if(line.charAt(line.length() - 1 - i) != 'J'){
                            m = false;
                        }
                        break;
                    case 'S':
                        if(line.charAt(line.length() - 1 - i) != '2'){
                            m = false;
                        }
                        break;
                    case 'Z':
                        if(line.charAt(line.length() - 1 - i) != '5'){
                            m = false;
                        }
                        break;
                    case '2':
                        if(line.charAt(line.length() - 1 - i) != 'S'){
                            m = false;
                        }
                        break;
                    case '3':
                        if(line.charAt(line.length() - 1 - i) != 'E'){
                            m = false;
                        }
                        break;
                    case '5':
                        if(line.charAt(line.length() - 1 - i) != 'Z'){
                            m = false;
                        }
                        break;
                    case 'A':
                    case 'H':
                    case 'I':
                    case 'M':
                    case 'O':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case '1':
                    case '8':
                        if(line.charAt(line.length() - 1 - i) != line.charAt(i)){
                            m = false;
                        }
                        break;
                    default:
                        m = false;
                }
            }
            if(line.length() % 2 != 0){
                switch(line.charAt(line.length() / 2 )){
                    case 'A':
                    case 'H':
                    case 'I':
                    case 'M':
                    case 'O':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case '1':
                    case '8':
                        break;
                    default:
                        m = false;
                }
            }
            if(m){
                if(p){
                    System.out.println(line + " -- is a mirrored palindrome.");
                }
                else{
                    System.out.println(line + " -- is a mirrored string.");
                }
            }
            else{
                if(p){
                    System.out.println(line + " -- is a regular palindrome.");
                }
                else{
                    System.out.println(line + " -- is not a palindrome.");
                }
            }
            System.out.println();
        }
    }
    
}
