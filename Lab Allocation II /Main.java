import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int y = s.nextInt();
      int z = s.nextInt();
      String n = s.next();
      if(n.equals("L1"))
      {
        if (y < z)
          System.out.println("L2");
        else 
          System.out.println("L3");
      }
      else if(n.equals("L2"))
      {
        if (x < z)
          System.out.println("L1");
        else
          System.out.println("L3");
      }
      else if(n.equals("L3"))
      {
        if (x < y)
          System.out.println("L1");
        else
          System.out.println("L2");
      }
    }
}