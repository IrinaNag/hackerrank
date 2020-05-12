import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        // Write Your Code Here
        in.close();
        System.out.printf("Array is sorted in %d swaps.%n", coutnSwapsForSort(a));
        System.out.printf("First Element: %d%n", a[0]);
        System.out.printf("Last Element: %d", a[n - 1]);
    }

    public static int coutnSwapsForSort(int[] a) {
        int swaps = 0;
        for (int i = 0; i < a.length; i++) {
            int cur_swaps = 0;
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                    cur_swaps++;
                }
            }
            swaps += cur_swaps;
            if (cur_swaps == 0) break;
        }
        return swaps;
    }
}
