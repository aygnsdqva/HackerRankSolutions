package HackerRank.interview.week.d1w.Solution;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class PilusMinus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        int n=scanner.nextInt();
        long positive=0;
        long negative=0;
        long zero=0;
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i]=scanner.nextLong();
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]==0){
                zero++;
            }else  if (arr[i]>0)
            {
                positive++;
            }else{
                negative++;
            }
        }
        double a=( positive/(double)n);
        double b=(negative/(double)n);
        double c=(zero/(double)n);

        System.out.println(formatter(a));
        System.out.println(formatter(b));
        System.out.println(formatter(c));


    }
    public static String formatter(double d){
        BigDecimal  value= BigDecimal.valueOf(d);
        String pattern = "#0.00000";
        DecimalFormat decimalFormat= new DecimalFormat(pattern);
        String output=decimalFormat.format(value);
        return  output;

    }
}
