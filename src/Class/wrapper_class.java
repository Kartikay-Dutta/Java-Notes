
package Class;
 class Demo2{
     Integer a  = Integer.valueOf(5);
     Integer b = 5;
     Integer c = new Integer(10); // heap main jayega coz of new

 }
public class wrapper_class {
    public static void main(String[] args) {
        Demo2 wd = new Demo2();
        System.out.println(wd.c);
        System.out.println(wd.a.intValue());
        System.out.println(wd.a.toString()); // internally as a string jayega

    }
}
