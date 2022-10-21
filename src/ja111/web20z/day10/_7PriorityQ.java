package ja111.web20z.day10;

import java.util.PriorityQueue;
import java.util.Queue;

public class _7PriorityQ {
    public static void main(String[] args) {

        Queue<String> pq=new PriorityQueue<>();
        pq.add("first");
        pq.add("abc");
        pq.add("xyz");

        pq.remove();
        System.out.println(pq);
    }
}
