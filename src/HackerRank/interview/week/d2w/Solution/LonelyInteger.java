package HackerRank.interview.week.d2w.Solution;
import java.util.*;


public class LonelyInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i!=j && arr[i]==arr[j]){
                    hashSet.add(arr[j]);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            hashSet.add(arr[i]);
        }
        int lastEle=0;
        for (int x : hashSet)
        { lastEle = x; }
        System.out.println(lastEle);
    }
}

