public class Student {
    private String name; // variable to store the student's name

    // Getter method to retrieve the student's name
    public String getName() {
        return name;
    }

    // Setter method to update the student's name
    public void setName(String newName) {
        name = newName;
    }

    public static void main(String[] args) {
        Student student = new Student(); // Create a new Student object
        student.setName("Mavya khan"); // Set the student's name

        String name = student.getName(); // Get the student's name
        System.out.println("Student's name: " + name); // Output: Student's name: John Doe

        student.setName("Mavya Tekula"); // Update the student's name
        name = student.getName(); // Get the updated student's name
        System.out.println("Updated name: " + name); // Output: Updated name: Jane Smith
    }
}
