import java.util.*;

public class Walkingmaster1806A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            Long a = scan.nextLong();
            Long b = scan.nextLong();
            Long c = scan.nextLong();
            Long d = scan.nextLong();
            scan.nextLine();
            Long diff = d - b;
            if (d < b) {
                System.out.println(-1);
            } else {
                a = a + diff;
                b = b + diff;
                if (a < c) {
                    System.out.println(-1);
                } else {
                    System.out.println((a - c) + diff);
                }
            }
        }
    }
}