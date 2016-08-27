import java.util.Scanner;

public class Main{

    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int testcase=read.nextInt();
        for(int case_=0;case_<testcase;case_++)
        {
            int n = read.nextInt();
            int[] grades = new int[n];
//            int[] grades = {100,95,90,80,70,60,50};
            for(int i=0;i<n;i++)
            {
                grades[i] = read.nextInt();
            }
            
            double average = average(grades);
            int count = 0;
            for(int i=0;i<n;i++)
            {
                if((double)grades[i]>average)
                {
                    count++;
                }
            }
            double percentage = (double)count/n * 100;
            System.out.printf("%.3f",percentage);
            System.out.println("%");
        }
    }
    
    public static double average(int[] array)
    {
        int total = 0;
        for(int i=0;i<array.length;i++)
        {
            total += array[i];
        }
        return (double)total/array.length;
    }
    
    
}
