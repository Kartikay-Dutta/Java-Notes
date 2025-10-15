package Class.Practise_ques_15_10_2025;

public class Easy_1 {

    // Inner Student class
    static class Student {
        // Instance variables
        private String name;
        private int rollNumber;
        private double marks;

        // Static variable
        private static int totalStudents = 0;

        // Default constructor
        public Student() {
            name = "Unknown";
            rollNumber = 0;
            marks = 0.0;
            totalStudents++;
        }

        // Parameterized constructor
        public Student(String name, int rollNumber, double marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
            totalStudents++;
        }

        // Method to calculate grade
        public char calculateGrade() {
            if (marks >= 90)
                return 'A';
            else if (marks >= 75)
                return 'B';
            else if (marks >= 50)
                return 'C';
            else
                return 'F';
        }

        // Display method
        public void displayDetails() {
            System.out.println("Name: " + name);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
            System.out.println();
        }

        // Static method to display total students
        public static void displayTotalStudents() {
            System.out.println("Total Students: " + totalStudents);
        }
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Kartikay", 101, 92);
        Student s2 = new Student("Riya", 102, 78);
        Student s3 = new Student();

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();

        Student.displayTotalStudents();
    }
}
