package HackerRank.algorithms.Solution;

import java.util.Scanner;

public class Staircase {
    public static void main(String[] args) {
        int n;
        Scanner scanner= new Scanner(System.in);
        n=scanner.nextInt();
        for (int i = 0; i <n ; i++) {
            for (int j = n-1; j >= 0; j--) {
                System.out.print(" "+ i + " "+ j+ ",");

            }
            System.out.println();

        }
    }
}
