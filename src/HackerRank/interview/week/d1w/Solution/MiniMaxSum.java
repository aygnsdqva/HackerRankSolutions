package HackerRank.interview.week.d1w.Solution;

import java.util.Scanner;

public class MiniMaxSum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        long arr[] = new long[5];
        long max=0;
        long min=100000000;
        long sum=0;
        for (int i = 0; i < 5; i++) {
            arr[i]=scan.nextLong();
            sum+=arr[i];
            if(arr[i]>max)
            { max=arr[i];
            }
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        System.out.print((sum-max) + " " + (sum-min));
    }
}
