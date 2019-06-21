


import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        while (n-- > 0) {
            String s1 = s.next();
            String a = s1.substring(0, 1);
            String b = s1.substring(s1.length() - 1, s1.length());
            if (a.equals(b)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
