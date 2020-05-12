import java.util.*;

class Solution {

    private static boolean charMatch(char char1, char char2) {
        if (char1 == '}' && char2 == '{' || char1 == ']' && char2 == '[' || char1 == ')' && char2 == '(') {
            return true;
        }
        return false;
    }

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            //Complete the code
            Stack<Character> st = new Stack<>();
            char cur_char;
            boolean flag = true;
            for (int i = 0; i < input.length(); i++) {
                cur_char = input.charAt(i);
                if (cur_char == '{' || cur_char == '[' || cur_char == '(') st.push(cur_char);
                else if (!st.empty() && charMatch(cur_char, st.peek())) st.pop();
                else {
                    flag = false;
                    break;
                }
            }
            System.out.println(st.empty() && flag);
        }
        sc.close();
    }
}
