import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i,j,k;
      for(i = 0; i < num; i++)
      {
        k = num - i;
        for(j = 0;j < num; j++)
        {
          if(k == num)
            System.out.print(num);
          else
          {
            System.out.print(k);
            k++;
          }
        }
        System.out.println();
      }
	}
}