import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Traverse {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Mavya");
        strings.add("John");
        strings.add("Duke");

        System.out.println("Traverse using iterator:");
        ListIterator<String> iterator = strings.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
