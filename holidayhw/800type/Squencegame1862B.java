import java.util.*;

public class Squencegame1862B {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        scan.nextLine();
        while (t-- > 0) {
            int n = scan.nextInt();
            int[] b = new int[n];
            ArrayList<Integer> a = new ArrayList<>();
            for (int i = 0; i < n; i++) {

                b[i] = scan.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    a.add(b[i]);
                } else {
                    if (b[i - 1] <= b[i]) {
                        a.add(b[i]);
                    } else {
                        a.add(1);
                        a.add(b[i]);
                    }
                }

            }
            System.out.println(a.size());
            for (int ans : a) {
                System.out.print(ans + " ");
            }
            System.out.println();
        }
    }
}