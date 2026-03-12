package Hashmap;
import java.util.*;
import java.util.HashSet;
import java.util.Iterator;
public class basic {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);

        System.out.println("Size of set: " + set.size());

        System.out.println(set);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }

}
