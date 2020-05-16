import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN.
        Print output to STDOUT. Your class should be named Solution. */
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            int cur=in.nextInt();
            System.out.println(isPrime(cur)?"Prime":"Not prime");
        }
        in.close();
    }

    private static boolean isPrime(int number) {
        if(number==2) return true;
        if(number==1 || (number&1)==0) return false;
        for (int i=3;i<=Math.sqrt(number);i+=2){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
}