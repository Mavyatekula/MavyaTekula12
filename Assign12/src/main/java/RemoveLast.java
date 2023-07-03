import java.util.ArrayDeque;
import java.util.ArrayList;

public class RemoveLast {
    public static void main(String[] args) {
        ArrayList<String> li = new ArrayList<>();

        li.add("Mavya");
        li.add("kite");
        li.add("car");
        li.add("bike");
        System.out.println("Actual list is" + li);

        if (li.size() > 0) {
            li.remove(li.size() - 1);
            System.out.println("Last element removed");
        } else {
            System.out.println("Empty arraylist,cant remove objects");
        }

        System.out.println("changed objects are:" + li);
    }
}
