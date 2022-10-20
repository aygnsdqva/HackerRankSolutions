package HackerRank.interview.tutorial.Array.Solution;

import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a= scanner.nextInt();
        int n= scanner.nextInt();
        int arr[] = new int[a];
        int k = a-n;
        int z=k;
        int arrFist[] = new int[k];
        int arrLast[] = new int[n];
        int arrFull[]= new int[a];
        for(int i=0; i<a;i++){
            arr[i]= scanner.nextInt();
        }
        for (int i=(a-1) ;i>(n-1) ; i-- ) {
            arrFist[z-1]=arr[i];
            z--;
        }

        for (int i = 0; i < n; i++) {
           arrLast[i] = arr[i];
        }
        for (int i = 0; i < k; i++) {
            arrFull[i]=arrFist[i];

        }
        for (int i = k; i < a ; i++) {
            arrFull[i]= arrLast[i-k];
        }

        for (int i = 0; i <a; i++) {
            System.out.print(arrFull[i] + " ");
        }

        
    }
}
