package Interface;

import java.util.ArrayList;
import java.util.Collections;

class G7students implements Comparable<G7students> {

    int rollno;
    String name;

    G7students(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public int compareTo(G7students o) {
        return this.rollno - o.rollno;
    }

    @Override
    public String toString() {
        return rollno + " " + name;
    }
}

public class prac_ques {
    public static void main(String[] args) {

        ArrayList<G7students> arrayList = new ArrayList<>();

        arrayList.add(new G7students(9, "Karthicc"));
        arrayList.add(new G7students(2, "Karthic"));

        Collections.sort(arrayList);

        System.out.println(arrayList);
    }
}