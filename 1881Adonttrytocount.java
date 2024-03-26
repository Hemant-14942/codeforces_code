import java.util.Scanner;

public final class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int j=0;j<t;j++) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            scan.nextLine();
            String x = scan.nextLine();
            String s = scan.nextLine();
            int flag = 0;
            if (x.contains(s)) {
                System.out.println(0);
                break;
            } else {
                for (int i = 1; i < m / 2 + 2; i++) {
                    x = x + x;
                    if (x.contains(s)) {
                        flag = 1;
                        System.out.println(i);
                        break;
                    }
                }
                if (flag == 0) {
                    System.out.println(-1);
                } 
            }
        }
        scan.close();
    }
}
//////////////////////////////////////////////////////////////////
//less time taking code
////////////////////////////////////////////////////////////////
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            String x = sc.next();
            String s = sc.next();

            if (x.contains(s))
                System.out.println(0);
            else {
                for (int i = 1;; i++) {
                    x = x + x;
                    if (x.contains(s)) {
                        System.out.println(i);
                        break;
                    } else {
                        if (x.length() > 2 * s.length()) {
                            System.out.println(-1);
                            break;
                        }
                    }
                }

            }
        }

    }
}