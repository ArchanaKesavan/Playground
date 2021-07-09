import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, j;
      for(i= 1;i <= num; i++)
      {
        for(j = 1;j <= i; j++)
        {
          if(j % 2 == 0)
          System.out.print("0 ");
          else
            System.out.print("1 ");
        }
        System.out.println();
      }
	}
}