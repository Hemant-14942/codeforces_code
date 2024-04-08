import java.util.*;

public class GrasshopperonaLine1837A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- > 0) {
            int x = scan.nextInt();
            int k = scan.nextInt();
            ArrayList<Integer> a = new ArrayList<>();
            if (x % k != 0) {
                System.out.println(1);
                System.out.println(x);
            } else {
                System.out.println(2);
                a.add(x - 1);
                a.add(1);
                for (int ans : a) {
                    System.out.print(ans + " ");
                }
                System.out.println();
            }
        }
    }
}