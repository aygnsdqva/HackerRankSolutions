package HackerRank.interview.week.d2w.Solution;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int dioq1=0;
        int dioq2=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
              if(i==j){
                 dioq1+= arr[i][j];
              }
              if((i+j)==(n-1))
              {
                  dioq2+=arr[i][j];
              }
            }
        }
        int minus=(dioq1-dioq2);
        if(minus<0)
        {
            minus*=(-1);
        }
        System.out.println(minus);


    }
}
