package Class;

public class default_constructor {

    static class Test {
        Test() {
            System.out.println("Constructor called");
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
    }
}
