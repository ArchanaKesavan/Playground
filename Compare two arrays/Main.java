import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int b[]=new int[n];
    int c=0;
    for(int i=0;i<n;i++)
    {
        a[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {
        b[i]=sc.nextInt();
    }
    for(int i=0;i<n;i++)
    {   
        if(a[i]==b[i])
        {
            c++;
        }
    }
    if(c==n)
    {
        System.out.println("Yes");
    }
    else
    {
       System.out.println("No");  
    }
  }
}