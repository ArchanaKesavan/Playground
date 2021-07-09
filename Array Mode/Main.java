import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int i,j,flag=0;
    for(i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[j]==arr[i])
            {
                flag=1;
                System.out.printf("Mode=%d ",arr[i]);
            }
        }
    }
    if(flag==0)
    {
        System.out.printf("The mode of the array is none");
    }
    
  }
}