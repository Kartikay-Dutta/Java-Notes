package queue;
import java.util.*;
import java.util.ArrayDeque;

public class cpu_scheduling {
    class Main{
        public static void main(String[] args) {
            Deque<String> dq = new ArrayDeque<>();

            dq.addLast("NormalTask");
            dq.addFirst("UrgentTask");

            System.out.println(dq.removeFirst());
            System.out.println(dq.removeFirst());
        }
    }
}
