package HackerRank.interview.tutorial.Array.Solution;
import java.util.Scanner;

public class TwoD_ArrayDS {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[6][6];

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {

                arr[i][j] = scanner.nextInt();


            }
        }

        int max = -1000;

        for(int i = 0 ; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                int top= arr[i][j] + arr[i][j+1] + arr[i][j+2];
                int avarage= arr[i+1][j+1] ;
                int end= arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] ;
                int total= top+avarage+end;
                if(total>max)
                {
                    max=total;
                }

            }
        }



        System.out.println(max);

        scanner.close();





    }
}
