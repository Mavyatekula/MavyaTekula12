import java.util.Arrays;
public class Capitalize {
public static void main(String[] args) {
    String[] s = {"kite", "playing", "mango", "orange"};
    Arrays.stream(s).map(str->str.substring(0,1).toUpperCase()+str.substring(1))
            .sorted()
            .forEach(i->System.out.println(i));

}

}
