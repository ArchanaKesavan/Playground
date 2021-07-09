import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner s=new Scanner(System.in);
        int n,i,odd=0,even=0;
        n=s.nextInt();
        int a[]=new int[20];
        for(i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else if(a[i]%2==1)
            {
                odd++;
            }
            
        }
        if(even==n)
        {
            System.out.println("The array is Even");
        }
        else if(odd==n)
        {
            System.out.println("The array is Odd");
            
        }
        else
        {
            System.out.println("The array is Mixed");
        }
  }
}