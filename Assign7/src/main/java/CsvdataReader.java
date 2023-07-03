import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.io.BufferedReader;
import java.util.ArrayList;

class Csvdata implements Comparable<Csvdata> {
     String firstName;
     String lastName;
     Float gpa;

    public Csvdata(String firstName, String lastName, float gpa) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public float getGpa()
    {
        return gpa;
    }

    @Override
    public int compareTo(Csvdata other) {
        return this.lastName.compareTo(other.getLastName());
    }
}

public class CsvdataReader {
    public static void main(String[] args) {
        String csvFile = "/Users/mavyatekula/Library/Containers/com.microsoft.Excel/Data/Downloads/Student.csv";
        String line;
        String csvDelimiter = ",";

        List<Csvdata> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            br.readLine();

            while ((line = br.readLine()) != null) {
                String[] studentData = line.split(csvDelimiter);
                String firstName = studentData[0];
                String lastName = studentData[1];
                float gpa = Float.parseFloat(studentData[2]);

                Csvdata student = new Csvdata(firstName, lastName, gpa);
                students.add(student);
            }
        } catch (IOException e)
        {

            e.printStackTrace();

        }

        Collections.sort(students);

        for (int i = 0; i < students.size(); i++) {
            Csvdata student = students.get(i);

            {
                System.out.println("First Name: " + student.getFirstName());
                System.out.println("Last Name: " + student.getLastName());
                System.out.println("GPA: " + student.getGpa());
            }
        }

    }
}
