import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String regex="<a href=\"([^\"]+)\"[^<>]*>(<[^<>]+>)*([^<>]*)</";
        while (scan.hasNext()){
            String str=scan.nextLine();
            printRes(str,regex);
        }
        scan.close();
    }

    private static void printRes(String str, String regex) {
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        while(m.find()) {
            System.out.printf("%s,%s%n", m.group(1).trim(), m.group(3).trim());
        }
    }
}
