import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc=new Scanner(System.in);
	  int num = sc.nextInt();
	  double m = 10, i, num1 = 5, x;
	  for(i = 1; i <= num; i++)
	   {
	      x = (m * m) - num1;
	      m = m + 1;
	      num1 = num1 + 0.5;
	      System.out.print(x+" ");
	   }
	}
}