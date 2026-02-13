package OOPS;

class ConstructorDemo { //isko public nahi kar skte coz dusri files isko filename se access karengi.
    int x; //jvm default zero deta hai under default constructor.
    ConstructorDemo(){
//      int y; // apne aap initialize nahi hoga so itll give an error\
        int x = 20;
        this.x = x; // this is used to access the object
        int y = 10;
        System.out.println(x);
        System.out.println(y);
    }
    ConstructorDemo(int x, int y){ // constructor overloading: same constructor with diff parameters
        System.out.println("In parameterized constructor.");
        this.fun(); // this ke saath methods bhi access hota hai not only objects
    }
    void fun(){
        System.out.println("In fun method");
    }
    public static void main(String[] args) {
        ConstructorDemo cd = new ConstructorDemo(30,40); //if we do this then the non parameterized constructor will not be called
//        ConstructorDemo c = new ConstructorDemo();
    }
}
