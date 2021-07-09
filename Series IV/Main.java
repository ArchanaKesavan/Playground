import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i;
      float num2 = 0.5f;
      for(i = 1;i <= num; i++)
      {
        System.out.print(num2+" ");
        num2 = num2 * 3;
      }
	}
}