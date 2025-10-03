package String;


    public class Student {
        String name;
        int rollNo;

        // constructor
        public Student(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;
        }

        // overriding toString()
        @Override
        public String toString() {
            return "Student{name='" + name + "', rollNo=" + rollNo + "}";
        }
    }

