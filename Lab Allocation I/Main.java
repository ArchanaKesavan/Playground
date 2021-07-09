import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int y = s.nextInt();
      int z = s.nextInt();
      if(x < y && x < z)
        System.out.println("L1");
      else if(y < x && y < z)
        System.out.println("L2");
      else 
        System.out.println("L3");
      
    }
}