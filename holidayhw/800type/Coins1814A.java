import java.util.*;

public class Coins1814A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            Long n = scan.nextLong();
            Long k = scan.nextLong();
            scan.nextLine();
            if (n % k == 0 || (n - k) % 2 == 0 || n % 2 == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");

            }
        }
    }
}
