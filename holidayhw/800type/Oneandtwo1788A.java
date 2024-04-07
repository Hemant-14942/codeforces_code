import java.util.*;
public class Oneandtwo1788A{
    public static void main(String[] args)
    {
        Scanner scan= new Scanner(System.in);
        int t = scan.nextInt();
        while(t-->0)
        {
            int c=0;
            int c2=0;
            int n= scan.nextInt();
            scan.nextLine();
            int a[]= new int[n];
            for(int i=0;i<n;i++){
                a[i]=scan.nextInt();
                if(a[i]==2)
                {
                    c=c+1;
                }
            }
            if(c%2!=0){
            System.out.println(-1);
            }
            else{
                 
                for(int i =0;i<n;i++)
                {
                   if(a[i]==2){
                       c2+=1;
                   }
                    if(c2==c/2)
                    {
                        System.out.println(i+1);
                        break;
                    }
                }
            }
        }
    }
}