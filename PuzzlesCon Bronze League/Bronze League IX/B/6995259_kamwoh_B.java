
import java.io.IOException;
import java.util.Scanner;

public class Main{
/**
 * 2620
10
2
2530
461
1658
297
1929
1923
152
463
2202
 * @param args
 * @throws IOException 
 */
    public static void main(String[] args) throws IOException
    {
        Scanner read = new Scanner(System.in);
//        Scanner read = new Scanner(new FileInputStream("C:\\Users\\pc\\Dropbox (Siswa)\\Dropbox\\Nixie Team Folder\\wohcode\\UVA\\src\\bronze\\input.txt"));
        int testcase = read.nextInt();
//        int testcase = 1;
        for (int case_ = 0; case_ < testcase; case_++)
        {
            int n = read.nextInt(); //number of days
            int p = read.nextInt(); //number of parties
//            int n = 2620;
//            int p = 10;
            boolean[] hartalDays = new boolean[n];
            int[] h = new int[p];
//            int[] h = {2,2530,461,1658,297,1929,1923,152,463,2202};
            for (int i = 0; i < h.length; i++)
            {
                h[i] = read.nextInt();
                int count = 1;
                while (true)
                {
                    int result = count * h[i];
                    if (result > n)
                        break;
                    if (result % 7 != 6 && result % 7 != 0)
                    {
                        hartalDays[result-1] = true;
                    }
                    count += 1;
                }
            }

            int output = 0;
            for (int i = 0; i < hartalDays.length; i++)
            {
                if (hartalDays[i])
                    output += 1;
            }
            System.out.println(output);
        }
    }
}
