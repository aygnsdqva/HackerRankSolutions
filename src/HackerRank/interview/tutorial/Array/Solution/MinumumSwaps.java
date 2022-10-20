package HackerRank.interview.tutorial.Array.Solution;
import java.util.Scanner;

public class MinumumSwaps {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n=scanner.nextInt();
        long[] arr = new long[Math.toIntExact(n)];

        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextLong();
        }
        long b;
        long d;
        int count=0;

        for (int l = 0; l < 100; l++) {
            for(int i=0;i<n;i++){
                if(i != (arr[i]-1))
                {
                    b=( arr[i]-1 );
                    d= arr[Math.toIntExact(b)];
                    arr[Math.toIntExact(b)]=arr[i];
                    arr[i]=d;
                    count++;
                }

            }
        }

        System.out.println(count);

        System.out.println("//////");
        for (int i = 0; i < n; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("//////");



    }
}
