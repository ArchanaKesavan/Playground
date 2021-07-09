import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
           Scanner s=new Scanner(System.in);
      //int i;
      int l=s.nextInt();
      int u=s.nextInt();
      while(l<=u)
      {
          System.out.println(l);
        l++;
      }
    }
}