import java.util.HashSet;
import java.util.Iterator;

public class HashsetPrgm {
    public static void main(String[] args){
        HashSet<String> set=new HashSet<>();
        set.add("Nike");
        set.add("Car");
        set.add("Mavya");
        set.add("Marie");
        set.add("bike");
        Iterator<String> i=set.iterator();
        while(i.hasNext()){
            String s=i.next();

        }
        for(String s:set){
            System.out.println(set);
        }
        System.out.println("Iterating using streams");
        set.stream().forEach(System.out::println);
    }
}
