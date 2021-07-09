import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, j, k;
      num = num * 2;
      for(i = 1;i <= num ; i = i+2)
      {
        for(j = i; j <= num; j = j+2)
        {
          System.out.print(j+" ");
        }
        System.out.println();
      }
	}
}