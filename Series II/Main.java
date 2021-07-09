import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i , n=5 ,sum = 6;
      for(i = 1;i <= num ; i++)
      {
        System.out.print(sum+" ");
        sum = sum + (i * n);
      }
	}
}