import java.util.Arrays;
import java.util.Comparator;

public class SortStrings {
    public static void main(String[] args){
        String[] s={"kite","elephant","apple","banana","bike"};

        Arrays.stream(s).sorted(Comparator.comparingInt(String::length)
                .thenComparing(Comparator.comparingInt((String str)->str.charAt(str.length() -1)).reversed()))
                .forEach(i->System.out.println(i));

    }
}
