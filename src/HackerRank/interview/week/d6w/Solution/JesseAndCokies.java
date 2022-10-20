package HackerRank.interview.week.d6w.Solution;
import java.util.*;

public class JesseAndCokies {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int k= scan.nextInt();
        List<Integer> arr= new LinkedList<>();
        for (int i = 0; i < n; i++) {
            arr.add(Math.toIntExact(scan.nextLong()));
        }
        System.out.println( cookies(k,arr));

    }
    public static int cookies(int k, List<Integer> A) {
        PriorityQueue<Integer> cookies = new PriorityQueue<>();

        A.forEach(element -> {
            cookies.offer(element);
        });

        int operations = 0;

        while (cookies.size() > 1 && cookies.peek() < k) {
            int leastSweetCookie = cookies.poll();
            int nextLeastSweetCookie = cookies.poll();
            int combinedCookie = leastSweetCookie + 2 * nextLeastSweetCookie;
            cookies.offer(combinedCookie);
            operations++;
        }

        if (cookies.peek() >= k) {
            return operations;
        }

        return -1;
    }
}
