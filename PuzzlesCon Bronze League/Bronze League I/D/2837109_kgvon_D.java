import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        
        int num=in.nextInt();
        
        while(num!=0)
        {
            int i=0, v=0, x=0,l=0,c=0;
            
            for(int factorial=num;factorial>0;factorial--)
            {
                int b=factorial/10;

                int a=factorial-(b*10);

                if (b == 1) {
                    x++;
                } else if (b == 2) {
                    x += 2;
                } else if (b == 3) {
                    x += 3;
                } else if (b == 4) {
                    x ++;l++;
                } else if (b == 5) {
                    l++;
                } else if (b == 6) {
                    l++;x+=1;
                } else if (b == 7) {
                    x += 2;l++;
                } else if (b == 8) {
                    x += 3;l++;
                } else if (b == 9) {
                    x += 1;c++;
                } else if (b == 10) {
                    c++;
                } 
                
                if(a==1){
                    i++;
                } else if(a==2){
                    i+=2;
                } else if(a==3){
                    i+=3;
                } else if(a==4){
                    i+=1;v++;
                } else if(a==5){
                    v++;
                } else if(a==6){
                    i+=1;v++;
                } else if(a==7){
                    i+=2;v++;
                } else if(a==8){
                    i+=3;v++;
                } else if(a==9){
                    i+=1;x++;
                } 
                
            }
            System.out.println(num+": "+i+" i, "+v+" v, "+x+" x, "+l+" l, "+c+" c");
            num=in.nextInt();
            
        }
    }
}
