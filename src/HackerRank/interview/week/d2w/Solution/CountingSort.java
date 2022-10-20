package HackerRank.interview.week.d2w.Solution;

import java.util.*;

public class CountingSort {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        List<Integer> arr= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Math.toIntExact(scan.nextLong()));
        }

        for (Integer a: countingSort(arr)
             ) {
            System.out.print(a + " ");

        }


    }
    public static List<Integer> countingSort(List<Integer> arr) {
        List<Integer> result = new ArrayList<Integer>();
        int[] frequency = new int[100];
        for(Integer each: arr)
            frequency[each] += 1;
        for(int each : frequency)
            result.add(each);
        return result;
    }
}
