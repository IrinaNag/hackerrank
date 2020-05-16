import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT.
        Your class should be named Solution. */
        int[] ar = new int[6];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++) ar[i] = in.nextInt();
        in.close();

        Calendar actual_date = new GregorianCalendar(ar[2], ar[1] - 1, ar[0]);
        Calendar expected_date = new GregorianCalendar(ar[5], ar[4] - 1, ar[3]);
        System.out.println(fineCalculation(actual_date, expected_date));
    }

    private static int fineCalculation(Calendar actual_date, Calendar expected_date) {
        if (!actual_date.after(expected_date)) return 0;
        if (actual_date.get(Calendar.YEAR) > expected_date.get(Calendar.YEAR)) return 10000;
        int months = actual_date.get(Calendar.MONTH) - expected_date.get(Calendar.MONTH);
        if (months > 0) return 500 * months;
        int days = actual_date.get(Calendar.DAY_OF_MONTH) - expected_date.get(Calendar.DAY_OF_MONTH);
        return 15 * days;
    }
}
