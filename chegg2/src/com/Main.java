
import java.util.*;

public class Main {

    public static PriorityQueue<String> intersection(PriorityQueue<String> q1, PriorityQueue<String> q2) {
        PriorityQueue<String> q3 = new PriorityQueue<>(q1);
        q3.retainAll(new HashSet<>(q2));
        return q3;
    }

    public static PriorityQueue<String> difference(PriorityQueue<String> q1, PriorityQueue<String> intersectionQueue) {
        PriorityQueue<String> q3 = new PriorityQueue<>(q1);
        q3.removeAll(new HashSet<>(intersectionQueue));
        return q3;
    }

    public static PriorityQueue<String> union(PriorityQueue<String> q1, PriorityQueue<String> q2) {
        Set<String> set = new HashSet<>(q1);
        set.addAll(q2);
        return new PriorityQueue<>(set);
    }

    public static void main(String[] args) {
        PriorityQueue<String> p1 = new PriorityQueue<String>();
        PriorityQueue<String> p2 = new PriorityQueue<String>();

        p1.add("Mihir");
        p1.add("Sahil");
        p1.add("DC");
        p1.add("Shrey");

        p2.add("Mihir");
        p2.add("Shrey");
        p2.add("Bhuvlo");

        System.out.println(p1);
        System.out.println(p2);

        PriorityQueue<String> union1 = union(p1, p2);
        PriorityQueue<String> intersection = intersection(p1, p2);
        PriorityQueue<String> difference = difference(p1, p2);

        System.out.println(union1);

        System.out.println(intersection);
        System.out.println(difference);

    }
}
