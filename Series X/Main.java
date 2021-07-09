import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int m = 2, i;
      System.out.print(m+" ");
      for(i = 1 ;i < num; i++)
      {
        m = (m * m) - 1;
        System.out.print(m+" ");
      }
	}
}