import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
public class Vowels {
    public static void main(String[] args){
        String[] s ={"kite","mango","apple","pineapple"};
        List<String> strList= Arrays.asList(s);

        strList.stream().filter(str->containVowels(str))
                .forEach(str->System.out.println(str+ "-" +numofVowels(str)+"vowels in given string"));
    }
    public static boolean containVowels(String str){
        return str.matches(".*[aeiouAEIOU].*");
    }
    private static int numofVowels(String str){
        return (int) str.chars().filter(ch->"aeiouAEIOU".indexOf(ch)!=-1)
                .count();
    }
}
