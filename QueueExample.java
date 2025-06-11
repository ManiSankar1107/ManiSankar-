import java.util.*;
public class QueueExample{
    public static void main(String[] args){
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        int removed=queue.poll();
        System.out.println("Removed:"+removed);
        int front=queue.peek();
        System.out.println("front:"+front);
        System.out.println("is empty:"+queue.isEmpty());
        }
}