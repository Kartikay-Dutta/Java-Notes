package OOPS;

public class static_basic {
    int a = 10;
    static int b = 20;  // statics lietime is the duration of the programns execution

    public static void main(String[] args) {
//        System.out.println(a); doesnt print coz default constructor main chala gya and without object call nahi hoga
        System.out.println(b);
    }
}
