import java.util.Arrays;

public class Printer {
    //Write your code here
    public <T> void printArray(T[]a){
        Arrays.stream(a).forEach(System.out::println);
    }

}
