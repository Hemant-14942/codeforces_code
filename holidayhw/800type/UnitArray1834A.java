import java.util.*;

public class UnitArray1834A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            scan.nextLine();
            int[] a = new int[n];
            int minus = 0;
            int plus = 0;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
                if (a[i] < 0) {
                    minus += 1;
                } else {
                    plus += 1;
                }
            }
            Arrays.sort(a);
            if (plus >= minus) {
                if (minus % 2 == 0) {
                    System.out.println(0);
                } else {
                    System.out.println(1);
                }
            } else {
                for (int i = minus - 1; i > 0; i--) {
                    a[i] = -a[i];
                    minus -= 1;
                    plus += 1;
                    ans += 1;
                    if (minus <= plus) {
                        if (minus % 2 == 0) {
                            System.out.println(ans);

                        } else {
                            System.out.println(ans + 1);
                        }
                        break;
                    }
                }

            }
        }
    }
}
