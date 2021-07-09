import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
      int a1[]=new int[n];
      int a2[]=new int[n];
    int count =0;
      for(int i=0;i<n;i++)
      {
        a1[i] = s.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        a2[i] = s.nextInt();
      }
    for(int i=0;i<n;i++)
    {
      if(a1[i]>=a2[i])
        count++;
    }
    if(count == n)
      System.out.println("Compatible");
    else
      System.out.println("Incompatible");
  }
}