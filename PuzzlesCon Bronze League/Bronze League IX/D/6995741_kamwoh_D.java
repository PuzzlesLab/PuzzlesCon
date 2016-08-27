import java.util.ArrayList;
import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        ArrayList<Long> list = new ArrayList<>();
        list.add(1l);
        list.add(2l);
        while (true)
        {
            int length = read.nextInt();
            if (length == 0)
                break;
            System.out.println(fibo(list, length));
        }
    }
    
    public static long fibo(ArrayList<Long> list, int length)
    {
        if(list.size()<=length)
        {
            long last_1 = list.get(list.size()-1);
            long last_2 = list.get(list.size()-2);
            long result = last_1 + last_2;
            list.add(result);
            return fibo(list,length);
        }
        else
        {
            return list.get(length-1);
        }
    }

    public static long fibo(int n)
    {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        else
            return fibo(n - 2) + fibo(n - 1);
    }

}