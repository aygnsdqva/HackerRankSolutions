package HackerRank.thirtyday.Solution;

import java.util.Scanner;

public class Daysof1DataTypes {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
        Scanner scan = new Scanner(System.in);
        int j=scan.nextInt();
        double f=scan.nextDouble();
        scan.nextLine();
        String a=  scan.nextLine();
        String b= s+a;
        System.out.println(i+j);
        System.out.println(d+f);
        System.out.println(b);
        scan.close();

    }
}
