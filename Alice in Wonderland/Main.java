import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner s = new Scanner(System.in);
      int a = s.nextInt();
      int x;
      x = (a%10)+(a/10);
      System.out.print("Alice must go in path-"+x);
	}
}