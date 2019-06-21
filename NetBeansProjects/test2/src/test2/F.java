

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class F {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Long> queue = new LinkedList<>();
        int n = scanner.nextInt();
        while (n-- > 0) {
            String s = scanner.next();
            if (s.contains("PUSH")) {
                long i = scanner.nextLong();
                queue.add(i);
            }
            if (s.contains("POP")) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            }
            if (s.contains("PRINT")) {
                if (queue.isEmpty()) {
                    System.out.println("NONE");
                } else {
                    System.out.println(queue.peek());
                }
            }
        }
    }
}
