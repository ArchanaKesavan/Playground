import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, j, count = 1;
        for(i = 1; i <= num; i++)
        {
          for(j = 1; j <= i; j++)
          {
           System.out.print(count+" ");
             count++;
          }
          System.out.println();
       }
	}
}