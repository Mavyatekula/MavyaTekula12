import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
class Students {
    String FirstName;
    String LastName;
    double GPA;

    public Students(String FirstName, String LastName, double GPA) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.GPA = GPA;
    }

    public double getGPA() {
        return GPA;
    }

    public String toString() {
        return FirstName + " " + LastName + "("+GPA+")";
    }
}
    public class ArrListStudents{
        public static void main(String[] args){
           List<Students> students=new ArrayList<>();
           students.add(new Students("Mavya","Tekula",3.4));
           students.add(new Students("John","marie",3.1));
           students.add(new Students("Bob","lawrie",3.5));
            double sum = students.stream()
                    .mapToDouble(Students::getGPA)
                    .sum();
            double avgGPA = sum / students.size();
            List<Students> remainstudents = students.stream()
                    .filter(student -> student.getGPA() >= avgGPA)
                    .collect(Collectors.toList());

            System.out.println("remaining students are");
            for(Students student:remainstudents) {
                System.out.println(student);
            }
        }
}
