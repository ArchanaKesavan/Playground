import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int pos,i;
        for(i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        pos=sc.nextInt();
        if (pos>n)
        {
            System.out.printf("Invalid Input");
        }
        else
        {
            System.out.printf("Array after deletion is\n");
            i=0;
            while(i<n)
            {
                if (i!=pos-1)
                    System.out.printf("%d\n", arr[i]);
                i++;
            }
        }
  }
}