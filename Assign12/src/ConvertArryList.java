import java.util.ArrayList;

public class ConvertArryList {
    public static void main(String[] args){
        ArrayList<String> li=new ArrayList<>();

        li.add("kite");
        li.add("bike");
        li.add("Mavya");
        li.add("car");

    String[] array=li.toArray(new String[li.size()]);

        for(String str:li){
            System.out.println(str);
        }

    }
}
