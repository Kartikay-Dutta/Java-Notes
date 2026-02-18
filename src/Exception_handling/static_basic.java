package Exception_handling;

public class static_basic {
    int a = 10;
    static int b = 20;  // statics lifetime is the duration of the programs execution

    void fun(){
        a = 20;
        b = 30;
    }
    public static void main(String[] args) {
//        System.out.println(a); // print nahi hoga coz it neeeds a object to exist
        System.out.println(b); // main is static so it can directly access b
        static_basic sb = new static_basic();
        System.out.println(sb.a);

        sb.fun(); //updated values print hogi
        System.out.println(sb.a);
        System.out.println(b);

    }
}
