package Class;

public class abstract_class {
    public static void main(String[] args) {
        abstract class Animal{
            abstract void makeSound(); // abstract method
            void sleep(){
                System.out.println("Sleeping"); //Concrete method
            }
        }
    }
}
