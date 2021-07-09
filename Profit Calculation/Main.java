import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s = new Scanner(System.in);
      int x = s.nextInt();
      int a = s.nextInt();
      int b = s.nextInt();
      System.out.println("The profit obtained is Rs."+(((x*a)-(x*b))-100));
	}
}