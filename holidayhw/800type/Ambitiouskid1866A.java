import java.util.*;
 public class Ambitiouskid1866A {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        scan.nextLine();
        int []a=new int[n];
        int temp=0;
        for(int i=0 ; i<n ; i++)
        {
            a[i]=scan.nextInt();
               
        }
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]<0)
            {
                a[i]=-a[i];
            }
               
        }
        {
        for(int i=0 ; i<n-1 ; i++)
        {
            if(n==1)
            {
                System.out.print(a[0]);
                break;
            }
            else
            {
              temp=a[0];
              if(a[0]>a[i+1])
              {
                a[0]=a[i+1];
                a[i+1]=temp;
              }
            } 
        }  
        System.out.print(a[0]); 
        }
     }
}
//////////////////////////////////////////

import java.util.*;

public class Ambitiouskid1866A {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        scan.nextLine();
        int []a=new int[n];
        int temp=0;
        for(int i=0 ; i<n ; i++)
        {
            a[i]=scan.nextInt();
               
        }
        for(int i=0 ; i<n ; i++)
        {
            if(a[i]<0)
            {
                a[i]=-a[i];
            }
               
        }
        Arrays.sort(a);
        System.out.print(a[0]);
    }
}        
