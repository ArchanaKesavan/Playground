import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, j;
      for(i = 1;i < (num * 2); i = i + 2)
      {
        for(j = 1;j <= i; j++)
        {
          System.out.print(j+" ");
        }
        System.out.println();
      }
	}
}