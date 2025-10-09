package Class;
 class Demo2{
     Integer a  = Integer.valueOf(5);
     Integer b = 5;
     Integer c = new Integer(10);

 }
public class wrapper_class {
    public static void main(String[] args) {
        Demo2 wd = new Demo2();
        System.out.println(wd.c);
    }
}
