import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner (System.in);
		int r=sc.nextInt();
      int c=sc.nextInt();
      int t=sc.nextInt();
      if((t<=c)||(t%c==0)||((t-1)%c==0))
      {
        System.out.println("Yes");
      }
      else
      {
         System.out.println("No");
	}
}
}