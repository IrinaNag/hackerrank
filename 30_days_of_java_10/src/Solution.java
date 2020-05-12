import java.util.Arrays;
import java.util.Scanner;

public class Solution {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String str = Integer.toBinaryString(n);
        int num = Arrays.stream(str.split("0+"))
                .map(x -> x.length())
                .max(Integer::compare)
                .get();
        System.out.println(num);

        scanner.close();
    }
}
