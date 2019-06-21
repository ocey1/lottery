

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class G {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<Long> deque = new ArrayDeque<Long>();
        int n = scanner.nextInt();
        while (n-- > 0) {
            String s = scanner.next();
            if (s.contains("PUSHBACK")) {
                long i = scanner.nextLong();
                deque.addLast(i);
            }
            if (s.contains("PUSHFRONT")) {
                long i = scanner.nextLong();
                deque.addFirst(i);
            }
            if (s.contains("POPFRONT")) {
                if (!deque.isEmpty()) {
                    deque.pollFirst();
                }
            }
             if (s.contains("POPBACK")) {
                if (!deque.isEmpty()) {
                    deque.pollLast();
                }
            }
            if (s.contains("PRINTFRONT")) {
                if (deque.isEmpty()) {
                    System.out.println("NONE");
                } else {
                    System.out.println(deque.peekFirst());
                }
            }
             if (s.contains("PRINTBACK")) {
                if (deque.isEmpty()) {
                    System.out.println("NONE");
                } else {
                    System.out.println(deque.peekLast());
                }
            }
        }
    }
}