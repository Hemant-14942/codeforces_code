// code work well and in time limit
import java.util.*;

public class Extremeround1766A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int freq;
            int ans = 9;
            scan.nextLine();
            if (n < 10) {
                System.out.println(n);
            } else {
                int c1=0;
                for (int j = 10; j <= n; j+=c1) {
                    c1=10;
                    if(j>=100)
                    {
                        c1=100;
                    }
                    if(j>=1000)
                    {
                        c1=1000;
                    }
                    if(j>=10000){
                        c1=10000;
                    }
                    if(j>=100000)
                    {
                        c1=100000;
                    }
                    if(j>=1000000){
                        c1=1000000;
                    }
                    freq = 0;
                    int num = j;
                    while (num > 0) {
                        int digit = num % 10;
                        if (digit != 0) {
                            freq++;
                        }
                        if (freq > 1) {
                            break;
                        }
                        num = num / 10;
 
                    }
                    if (freq == 1) {
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}

// time exceed in this code but concept is alright
import java.util.*;
public class Extremelyround1766A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int freq;
            int ans = 10;
            scan.nextLine();
            if (n < 11) {
                System.out.println(n);
            } else {
                for (int j = 11; j <= n; j++) {
                    freq = 0;
                    String str = Integer.toString(j);
                    for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) != '0') {
                            freq++;
                        }
                    }
                    if (freq == 1) {
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
////////////////////////////////////////////////////////////
// time exceed code is working well
import java.util.*;

public class Extremeround1766A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int freq;
            int ans = 10;
            scan.nextLine();
            if (n < 11) {
                System.out.println(n);
            } else {
                for (int j = 1; j <= n; j++) {
                    if (j % 10 != 0) {
                        continue;
                    }
                    freq = 0;
                    int num = j;
                    while (num > 0) {
                        int digit = num % 10;
                        if (digit != 0) {
                            freq++;
                        }
                        if (freq > 1) {
                            break;
                        }
                        num = num / 10;

                    }
                    if (freq == 1) {
                        ans++;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}