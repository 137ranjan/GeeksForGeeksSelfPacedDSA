import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.offerFirst(10); // dq.addFirst(10);
        dq.offerLast(20); // dq.addLast(20);
        dq.offerFirst(5); // dq.addFirst(10);
        dq.offerLast(15); // dq.addLast(20);
        System.out.println(dq.peekFirst()); // dq.getFirst();
        System.out.println(dq.peekLast()); // dq.getLast();
        dq.pollFirst(); // dq.removeFirst();
        dq.pollLast(); // dq.removeLast();
        System.out.println(dq.peekFirst()); // dq.getFirst();
        System.out.println(dq.peekLast()); // dq.getLast();

        Iterator<Integer> it = dq.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
        System.out.println(" ");
        for(int x: dq){
            System.out.print(x+" ");
        }
        System.out.println(" ");
        Iterator<Integer> dIt = dq.descendingIterator();
        while (dIt.hasNext()) {
            System.out.print(dIt.next()+" ");
        }
        System.out.println(" ");
    }
}