//write the program Implement ArrayDeque.
import java.util.ArrayDeque;

public class ImplementArrayDeque {
    public static void main(String[] args){
      
        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(45);
        adq.offerFirst(12);
        adq.offerLast(49);
        adq.offer(50);
        adq.offer(60);
        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() " +adq);

        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() "+adq);

        System.out.println(adq.pollLast());
        System.out.println("adq.pollLast()" +adq);

        System.out.println(adq.getFirst());
        System.out.println("getFirst() "+adq );

    }
}
