import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentObj {
    public static void main(String[] args) {
        class Obj {
            String FirstName;
            String LastName;
            double GPA;

            public Obj(String FirstName, String LastName, double GPA) {
                this.FirstName = FirstName;
                this.LastName = LastName;
                this.GPA = GPA;
            }

            public String getFirstName() {
                return FirstName;
            }

            public String getLastName() {
                return LastName;
            }

            public double getGPA() {
                return GPA;
            }

            public String toString() {
                return "Obj{" +
                        "FirstName='" + FirstName + '\'' +
                        ",LastName='" + LastName + '\'' +
                        ",GPA=" + GPA +
                        '}';
            }
        }
        HashMap<String, Obj> studentMap = new HashMap<>();

        studentMap.put("John", new Obj("John", "Doe", 3.8));
        studentMap.put("Alice", new Obj("Alice", "Smith", 3.9));
        studentMap.put("Bob", new Obj("Bob", "Johnson", 3.5));
        studentMap.put("Emily", new Obj("Emily", "Davis", 3.7));
        studentMap.put("Michael", new Obj("Michael", "Brown", 3.2));
        studentMap.put("Sophia", new Obj("Sophia", "Miller", 3.6));
        studentMap.put("Daniel", new Obj("Daniel", "Wilson", 3.4));
        studentMap.put("Olivia", new Obj("Olivia", "Taylor", 3.1));

        System.out.println("Print Entry Set");
        System.out.println("Print using Entry set:");
        for (Map.Entry<String, Obj> entry : studentMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        System.out.println("Print using map's forEach method:");
        studentMap.forEach((key, value) -> System.out.println("Key: " + key + ", Value: " + value));

        System.out.println("Print using keySet and Iterator:");
        Iterator<String> iterator = studentMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Obj student = studentMap.get(key);
            System.out.println("Key: " + key + ", Value: " + student);
        }
    }
}
