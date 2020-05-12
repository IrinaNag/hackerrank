import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int q, x, y;
        String str;
        //scan.skip("(\\r\\n|[\\r\\n\\u2028\\u2029\\u0085])?");
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) l.add(scan.nextInt());
        //List<Integer> l = Arrays.stream(scan.nextLine().trim().split(" "))
        //        .map(Integer::parseInt).collect(toList());
        q = scan.nextInt();
        while (q-- != 0) {
            str = scan.next();
            if (str.equals("Insert")) {
                x = scan.nextInt();
                y = scan.nextInt();
                l.add(x, y);
            }
            if (str.equals("Delete")) {
                x = scan.nextInt();
                l.remove(x);
            }
        }
        for (int i = 0; i < l.size(); i++) System.out.print(l.get(i) + " ");


        scan.close();
    }
}
