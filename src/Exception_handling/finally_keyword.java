package Exception_handling;

public class finally_keyword {

    public static void main(String[] args) {

        try {
            int x = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught");
        } finally {
            System.out.println("Finally block");
            try{
                System.out.println("idk");
            }
            finally{
                throw new ArithmeticException("last throw");
            }
        }

    }
}
