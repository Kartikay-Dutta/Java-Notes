package OOPS;

class ConstructorDemo {
    int x; //jvm default zero deta hai under default constructor.
    ConstructorDemo(){
        System.out.println(x);
    }
    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo();
    }
}
