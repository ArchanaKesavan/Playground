import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int d=sc.nextInt();
      int e=sc.nextInt();
      double x=(a*350.34)+(b*230.90)+(c*190.55)+(d*125.30)+(e*180.90);
      if(15000>x)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}