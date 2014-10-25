import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args)  throws IOException {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s=br.readLine();
        boolean start=true;
        while(s!= null){
        	char [] c=s.toCharArray();
        	for (int i=0;i<c.length;i++) {
        		if (c[i]=='\"') {
        			if (start) {
        				System.out.print("``");
        				start=false;
        			} else {
        				System.out.print("''");
        				start=true;
        			}
        		} else {
    				System.out.print(c[i]);
        		}
        	}
        	System.out.println();
            s=br.readLine();
        }
	}  
}