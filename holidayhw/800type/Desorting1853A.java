import java.util.*;

public class Desorting1853A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int a[] = new int[n];
            int max = 0;
            int diff=0;
            for (int i = 0; i < n; i++) {
                a[i] = scan.nextInt();
            } 
            for (int i = 0; i < n-1; i++) {
                diff=(a[i+1]-a[i])
                if(diff<0)
                {
                    System.out.print(0);
                }
                else
                {
                    if(diff>max)
                    {
                        max=diff;
                    }
                }
            } 
            System.out.print(max/2+1);
        }
    }
}