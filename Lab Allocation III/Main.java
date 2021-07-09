import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
      int x = obj.nextInt();
      int y = obj.nextInt();
      int z = obj.nextInt();
      int n = obj.nextInt();
      int count = 0;
      if(x>=n)
        count++;
      if(y>=n)
        count++;
      if(z>=n)
        count++;
      System.out.println(count);
    }
}