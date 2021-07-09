import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    int i,found=0;
    for(i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
   int ele=sc.nextInt();
    for(i=0;i<n;i++)
    {
        if (arr[i]==ele)
        {
            System.out.printf("%d is present in the array", ele);
            found = 1;
        }
    }
    if (found==0)
        System.out.printf("%d is not present in the array", ele);
  } 
}