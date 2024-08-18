
package Queue;

import java.util.LinkedList;
import java.util.Queue;


public class Main {

    
    public static void main(String[] args) {
    Queue<Integer> queue = new LinkedList<>();
    queue.add(10);
    queue.offer(25);
    queue.offer(15);
    queue.offer(50);
    System.out.println(queue);
    }
    
}
