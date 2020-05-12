import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String regex="(?<=)";
        List<String> list=new ArrayList<>();
        int n=scan.nextInt();
        for (int i=0;i<n;i++){
            String str=scan.nextLine();
            findAndAddToList(str,regex,list);
        }
        list.stream().distinct().sorted();
        for (int i=0;i<list.size()-2;i++) System.out.printf("%s;",list.get(i));
        System.out.println(list.get(list.size()-1));
        scan.close();
    }

    private static void findAndAddToList(String str, String regex,List<String> list) {
        Pattern p=Pattern.compile(regex);
        Matcher m=p.matcher(str);
        while(m.find()) {
            list.add(m.group());
        }
    }
}
