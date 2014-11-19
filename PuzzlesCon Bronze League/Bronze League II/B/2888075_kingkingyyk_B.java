import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {  
	      DataInputStream input=new DataInputStream(System.in);
	      DataOutputStream output=new DataOutputStream(System.out);
	      String s=input.readLine();
	      while (s!=null){
	    	  String toDisplay="";
	    	  for (char c : s.toCharArray()) {
	    		  toDisplay+=(char)(c-7);
	    	  }
	    	  output.writeBytes(toDisplay+"\n");
	    	  output.flush();
	    	  s=input.readLine();
	      }
	}  

}