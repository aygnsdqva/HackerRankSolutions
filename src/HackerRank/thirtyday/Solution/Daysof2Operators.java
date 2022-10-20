package HackerRank.thirtyday.Solution;

import java.util.Scanner;

public class Daysof2Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mealCost= scanner.nextDouble();
        int tipPercent= scanner.nextInt();
        int taxPercent=scanner.nextInt();
        double tip = (mealCost * tipPercent) / 100;
        double tax = (mealCost * taxPercent) / 100;
        int totalCost = (int)(Math.round(mealCost + tip + tax));
        System.out.println(totalCost);



    }
}
