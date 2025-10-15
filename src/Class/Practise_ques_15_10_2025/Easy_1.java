package Class.Practise_ques_15_10_2025;

public class Easy_1 {

    static class Student {
        private String name;
        private int rollNumber;
        private double marks;

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

        // Compact display method
        public void displayDetails() {
            System.out.println(name + "(" + rollNumber + ") Marks: " + marks + " Grade: " + calculateGrade());
        }

        public static int getTotalStudents() {
            return totalStudents;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student("John", 101, 85);
        Student s2 = new Student("Riya", 102, 93);
        Student s3 = new Student("Aman", 103, 47);

        System.out.println("Total Students: " + Student.getTotalStudents());

        s1.displayDetails();
        s2.displayDetails();
        s3.displayDetails();
    }
}
