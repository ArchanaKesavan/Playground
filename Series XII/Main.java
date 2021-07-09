import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int n1 = 9,n2 = 11;
      int i, n3;
      System.out.print(n1+" ");
      System.out.print(n2+" ");
      for(i = 1;i < num-1; i++)
      {
        n3 = n1 + n2;
        n1 = n2;
        n2 = n3;
        System.out.print(n3+" ");
      }
	}
}