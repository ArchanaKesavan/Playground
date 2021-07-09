import java.util.*;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
      int a1[]=new int[n];
    int count =0,num;
      for(int i=0;i<n;i++)
      {
        a1[i] = s.nextInt();
      }
      for(int i=0;i<n;i++)
      {
        num = a1[i];
        for(int j=i+1;j<n;j++)
        {
          if(num==a1[j])
          {
            count++;
          }
        }
      }
    System.out.println(n-count);
  }
}