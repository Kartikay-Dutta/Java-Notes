package List;
import java.util.ArrayList;
import java.lang.*;
public class DemoRun {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add(45);
        list.add("Java");
        list.add(67.67);
        list.add(false);

        for(Object o: list){
            System.out.println(o + " ");
        }
    }

}
