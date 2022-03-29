import java.util.ArrayList;

public class BankAccount {
    private ArrayList<Student> roster; // Collection of Student objects

    public BankAccount() {
        roster = new ArrayList<Student>();
    }

    // Drops a student from course by removing student from course roster
    public void dropStudent(String last) {
        Student toRemove = new Student("n", "n", 0.0);
        for (Student student: roster) {
            if (student.getLast() == last) {
                toRemove = student;
            }
        }
        roster.remove(toRemove);
    }

    public void addStudent(Student s) {
        roster.add(s);
    }

    public int countStudents() {
        return roster.size();
    }

    // main
    public static void main(String args[]) {
        BankAccount course = new BankAccount();
        String first;  // first name
        String last;   // last name
        double gpa;    // grade point average
        int beforeCount;

        first = "Henry";
        last = "Nguyen";
        gpa = 3.5;
        course.addStudent(new Student(first, last, gpa));  // Add 1st student

        first = "Brenda";
        last = "Stern";
        gpa = 2.0;
        course.addStudent(new Student(first, last, gpa));  // Add 2nd student

        first = "Lynda";
        last = "Robison";
        gpa = 3.2;
        course.addStudent(new Student(first, last, gpa));  // Add 3rd student

        first = "Sonya";
        last = "King";
        gpa = 3.9;
        course.addStudent(new Student(first, last, gpa));  // Add 4th student

        beforeCount = course.countStudents();  // Number of students before dropping any students
        last = "Stern";
        course.dropStudent(last); // Should drop Brenda Stern

        System.out.println("Course size: " + beforeCount + " students");     // Should output 4
        System.out.println("Course size after drop: " + course.countStudents() + " students");     // Should output 3
    }
}