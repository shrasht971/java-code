//A PriorityQueue is a class that represents a queue where elements are ordered based on their priority. 
//Elements are retrieved in order of priority, 
//with the highest priority elements being dequeued first.

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class ImplementPriorityQueue {
   public static void main(String[] args){
    
    Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

    pq.offer(40);
    pq.offer(12);
    pq.offer(2);
    pq.offer(36);
    pq.offer(24);

    System.out.println(pq);
    pq.poll();
    System.out.println(pq);

    System.out.println(pq.peek());
    System.out.println(pq);
   }    
}
