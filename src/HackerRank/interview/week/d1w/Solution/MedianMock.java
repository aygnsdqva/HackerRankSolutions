package HackerRank.interview.week.d1w.Solution;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MedianMock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n= scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextInt();
        }
        Arrays.sort(arr);
        int number = n%2;
        int median= (n-number)/2;
        System.out.println(arr[median]);


    }
}
