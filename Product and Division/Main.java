import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int b = s.nextInt();
      System.out.println(a*b);
      System.out.println(a/b);
      System.out.print(a%b);
    }
}