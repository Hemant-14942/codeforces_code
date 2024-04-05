import java.util.*;

public class PrependandAppend1791C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            scan.nextLine();
            int c = 0;
            String a = scan.nextLine();
            for (int i = 0; i < n / 2; i++) {
                if (a.charAt(i) != a.charAt(n - 1 - i)) {
                    c += 1;
                } else {
                    break;
                }
            }
            System.out.println(n - 2 * c);

        }
    }
}