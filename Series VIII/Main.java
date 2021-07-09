import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, sum = 4;
      System.out.print(sum+" ");
      for(i = 1;i < num; i++)
      {
        sum = sum + (i * i);
        System.out.print(sum+" ");
      }
	}
}