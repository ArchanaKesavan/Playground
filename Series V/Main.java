import java.util.Scanner;
import java.lang.Math;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      double n = 11;
      int i;
      for(i = 1;i <= num;i++)
      {
        System.out.print((int)Math.pow(n,2)+" ");
        n = n + 4;
      }
	}
}