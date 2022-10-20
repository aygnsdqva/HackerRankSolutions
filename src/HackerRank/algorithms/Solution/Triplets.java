package HackerRank.algorithms.Solution;

import java.util.Scanner;

public class Triplets {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        long a[]= new long[3];
        long b[]= new long[3];
        for (int i = 0; i < 3; i++) {
            a[i]=scan.nextLong();
        }
        for (int i = 0; i < 3; i++) {
            b[i]=scan.nextLong();
        }
        int big=0;
        int small=0;

        for (int i = 0; i < 3; i++) {
            if(a[i]>b[i])
            {
                big++;
            }
            if(a[i]<b[i])
            {
                small++;
            }
        }
        long endNum[] = {big,small};
        for (int i = 0; i < 2; i++) {
            System.out.print(endNum[i]);
        }
    }
}
