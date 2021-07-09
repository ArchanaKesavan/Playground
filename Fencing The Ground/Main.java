import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int l = s.nextInt();
    int b = s.nextInt();
    System.out.println((l*2)+(b*2)+"m");
    System.out.println(l*b+"sqm");
  }
}