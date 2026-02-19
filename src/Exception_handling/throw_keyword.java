package Exception_handling;

public class throw_keyword {
    public static void main(String[] args) {
        int age  = 11;
        if(age<18){
            throw new ArithmeticException("Not Eligible");
        }
        System.out.println("Eligible");
    }
}
