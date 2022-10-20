package HackerRank.algorithms.Solution;

import java.util.Scanner;

public class VeyBigSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n= scan.nextLong();
        long arr[]= new long[Math.toIntExact(n)];
        long sum=0;
        for (int i = 0; i < n; i++) {
            arr[i]=scan.nextLong();
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}
