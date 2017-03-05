import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,i=1,j,k;
        Scanner in = new Scanner(System.in);
        n= in.nextInt();
        while(i<=n){
            int m=0,l=0;
            j=in.nextInt();
            k=in.nextInt();
            while(j<=k){
                
                if(j%2==0){
                    j++;
                }
                m=j;
                l=l+m;
                 
                j+=2;
            }
           
            System.out.println("Case "+i+": "+l);
             i++;
        }
    }
}
