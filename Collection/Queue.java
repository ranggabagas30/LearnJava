import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>(); 
        for(int i=10; i>0; i--) {
            queue.add(i); 
        }

        // Queue: (Front) 10 9 8 7 6 5 4 3 2 1 (Rear)
        // PriorityQueue: (Front) 1 2 3 4 5 6 7 8 9 10 (Rear) -> Sorted queue, the actual one

        // Peeking -> Obtaining the head of Queue
        // Polling -> Remove the head of Queue 

        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}