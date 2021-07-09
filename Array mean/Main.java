import java.util.*;
 class Main
 {
   public static void main(String args[])
   {
     //type your code here
     Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int i;
        float   mean = 0, sum = 0 ,avg=0;
        for (i=0;i<n;i++ )
        {
            a[i]=sc.nextInt();
        } 
        for (i=0;i<n;i++)
        {
            sum = sum + a[i] ;
            avg = sum / n ;
        } 
        System.out.printf("The mean of the array is %.2f ", avg) ;
   }
 }