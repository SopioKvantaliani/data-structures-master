import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;

public class CollectionsQueueTasks {
    public static void main(String[] args) {

        Deque <Integer> deque = new ArrayDeque<>();
        PriorityQueue <String> pq = new PriorityQueue<>();

        pq.add("John");
        pq.add ("Michael");
        pq.add ("Carol");

        System.out.println(pq.remove()); //Carol
        System.out.println(pq.remove()); //John
        System.out.println(pq.remove());//Michael





    }
}
