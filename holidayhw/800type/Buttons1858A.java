
import java.util.Scanner;
class Buttons1858A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            if (a != b) {
                if((a+c)>(b+c))
                {
                      System.out.println("First");    
                }
                else 
                {
                System.out.println("Second");
                }
            if(a==b)
            {
                if(c%2==0)
                {
                    System.out.println("Second");
                }
                else
                {
                    System.out.println("First");
                }
   
            }    
            }
        }
        scan.close();
    }
}