import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      char[] arr1 = new char[]{'q','w','e','r','t','y','u','i','o','p','[',']','\\'};
      char[] arr2 = new char[]{'a','s','d','f','g','h','j','k','l',';','\''};
      char[] arr3 = new char[]{'z','x','c','v','b','n','m',',','.','/'};
      
      String s = input.nextLine();
      String output = "";
      for (int i=0; i<s.length(); i++){
          char key = s.charAt(i);
          boolean found = false;
          if (Character.isUpperCase(key)){
                  key = (char) Character.toLowerCase(key);
              }
          for (int j=0; j<arr1.length; j++){
              if (key==arr1[j]){
                  output += arr1[j-2];
                  found = true;
                  continue;
              }
          }
           for (int j=0; j<arr2.length; j++){
              if (key==arr2[j]){
                  output += arr2[j-2];
                  found = true;
                  continue;
              }
          }
           for (int j=0; j<arr3.length; j++){
              if (key==arr3[j]){
                  output += arr3[j-2];
                  found = true;
                  continue;
              }
          }
           if (found==false){
               output += s.charAt(i);
           }
      }
        System.out.println(output);
    }   
}
