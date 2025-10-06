package Class;

public class basic_class {
    public static void main(String[] args) {

        class Person {
            public String name;
            private int age;
            protected String address;

            // Constructor
            public Person(String n, int a, String addr) {
                name = n;
                age = a;
                address = addr;
            }

            // Display info
            public void displayInfo() {
                System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
            }

            // Getter for age
            public int getAge() {
                return age;
            }

            // Inner class Test
            public class Test {
                public void run() {
                    Person p1 = new Person("Kartikay", 20, "Chandigarh");
                    p1.displayInfo();
                    System.out.println("Retrieved age using getter: " + p1.getAge());
                }
            }
        }

        // Create a Person instance to access the inner Test class
        Person person = new Person("Temp", 0, "Nowhere");
        Person.Test test = person.new Test();
        test.run(); // call the run() method to execute the test
    }
}
