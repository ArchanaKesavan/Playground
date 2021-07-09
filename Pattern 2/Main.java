import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i,j,k=0;
      for(i = 1;i<=num;i++)
      {
        for(j=1;j<=i;j++)
        {
          ++k;
        if(k%2==0)
          System.out.print("1 ");
         else
           System.out.print("0 ");
        }
        System.out.println();
      }
	}
}