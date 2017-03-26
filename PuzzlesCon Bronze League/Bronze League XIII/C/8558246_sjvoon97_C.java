import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        BigInteger a,b;
        do{
            a=in.nextBigInteger();
            b=in.nextBigInteger();
            if(a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)){
                in.close();
                break;
            }
            else{
                BigInteger m = a.mod(BigInteger.TEN);
                if(b.equals(BigInteger.ZERO)){
                    System.out.println(1);
                }
                else if(b.equals(new BigInteger("1")))
                    System.out.println(m.intValue());
                else{
                    switch(m.intValue()){
                        case 0:
                            System.out.println(0);
                            break;
                        case 1:
                            System.out.println(1);
                            break;
                        case 5:
                            System.out.println(5);
                            break;
                        case 6:
                            System.out.println(6);
                            break;
                        case 2:
                            if((b.mod(new BigInteger("4"))).equals(BigInteger.ZERO))
                                System.out.println(6);
                            else if((b.mod(new BigInteger("4"))).equals(new BigInteger("1")))
                                System.out.println(2);
                            else if((b.mod(new BigInteger("4"))).equals(new BigInteger("2")))
                                System.out.println(4);
                            else
                                System.out.println(8);
                            break;
                        case 3:
                            if((b.mod(new BigInteger("4"))).equals(BigInteger.ZERO))
                                System.out.println(1);
                            else if((b.mod(new BigInteger("4"))).equals(new BigInteger("1")))
                                System.out.println(3);
                            else if((b.mod(new BigInteger("4"))).equals(new BigInteger("2")))
                                System.out.println(9);
                            else
                                System.out.println(7);
                            break;
                        case 7:
                            if((b.mod(new BigInteger("4"))).equals(BigInteger.ZERO))
                                System.out.println(1);
                            else if((b.mod(new BigInteger("4"))).equals(new BigInteger("1")))
                                System.out.println(7);
                            else if((b.mod(new BigInteger("4"))).equals(new BigInteger("2")))
                                System.out.println(9);
                            else
                                System.out.println(3);
                            break;
                        case 8:
                            if((b.mod(new BigInteger("4"))).equals(BigInteger.ZERO))
                                System.out.println(6);
                            else if((b.mod(new BigInteger("4"))).equals(new BigInteger("1")))
                                System.out.println(8);
                            else if((b.mod(new BigInteger("4"))).equals(new BigInteger("2")))
                                System.out.println(4);
                            else
                                System.out.println(2);
                            break;
                        case 4:
                            if((b.mod(new BigInteger("2"))).equals(BigInteger.ZERO))
                                System.out.println(6);
                            else 
                                System.out.println(4);
                            break;
                        case 9:
                            if((b.mod(new BigInteger("2"))).equals(BigInteger.ZERO))
                                System.out.println(1);
                            else 
                                System.out.println(9);
                            break;
                    }
                }
            }
        }while(!(a.equals(BigInteger.ZERO) && b.equals(BigInteger.ZERO)));
    }

}