import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,t;
        double median=0;
        int a[]=new int[n];
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
            for(j=1;j<n;j++)
            {
                if(a[i]>a[j])
                {
                    t=a[j];
                    a[j]=a[i];
                    a[i]=t;
                }
            }
        }
    
        if(n%2==1)
        {
            median=a[(n/2)+1];
        }
        else
        {
            if(n%2==0)
            {
                float  inter=a[n/2]+a[(n/2)+1];
                median =inter/2.0;
            }
        }
        System.out.printf("The median of the array is %.2f",median);
  }
  }