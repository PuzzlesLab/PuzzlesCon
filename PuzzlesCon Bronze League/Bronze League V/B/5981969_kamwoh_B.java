
import java.util.Arrays;
import java.util.Scanner;


public class Main{

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int[] total= new int[n];
        for(int i=0;i<n;i++)
        {
            int sN = read.nextInt();
            int[] arr = new int[sN];
            for(int j=0;j<sN;j++)
            {
                arr[j] = read.nextInt();
            }
            Arrays.sort(arr);
            int median = arr[sN/2];
            for(int j=0;j<sN;j++)
            {
                total[i]+=Math.abs(arr[j]-median);
            }
            System.out.println(total[i]);
        }
    }
}
