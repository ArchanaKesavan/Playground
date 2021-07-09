import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int n1 = 3,n2 = 8, i, n3;
      System.out.print(n1+" ");
      System.out.print(n2+" ");
      for(i = 2;i < num; i++)
      {
        n3 = n1 + n2 + i;
        System.out.print(n3+" ");
        n1 = n2;
        n2 = n3;
      }
	}
}