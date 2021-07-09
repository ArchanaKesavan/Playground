import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i, sq=0;
      for(i = 1 ; i <= num ; i++)
      {
        sq = i * i;
        System.out.print(sq+" ");
      }
	}
}