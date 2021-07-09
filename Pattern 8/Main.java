import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, j;
      for(i = 1;i <= num; i++)
      {
        for(j = 1;j <= num; j++)
        {
          if(j == i || (i+j) == (num+1))
          {
            System.out.print("*");
          }
         else
           System.out.print(" ");
        }
       
        System.out.println();
      }
	}
}