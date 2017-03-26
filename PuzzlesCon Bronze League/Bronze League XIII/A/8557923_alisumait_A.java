import java.util.*;
public class Main{
  static String keyboard="1234567890-=qwertyuiop[]asdfghjkl;'zxcvbnm,./";
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    while(sc.hasNext()){
      String str=sc.nextLine();
      decode(str,str.length());
    }
  }
  static void decode(String str,int n){
    String print="";
    for(int i=0;i<n;i++){
      
      if(str.charAt(i)==' '){
        print+=" ";
      }
      else{
        print+=search(Character.toLowerCase(str.charAt(i)));
      }
    }
    System.out.println(print);
  }
  static char search(char c){
    int i=0;
    for(;i<keyboard.length();i++){
        if(keyboard.charAt(i)==c){
          break;
        }
    }
    return keyboard.charAt(i-2);
  }
}