import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc=new Scanner (System.in);
		int r=sc.nextInt();
      int c=sc.nextInt();
      int t=sc.nextInt();
        if(t<=r || t%r==1 || t>=(r*(c-1)))
      {
        System.out.println("yes");
      }
      else
      {
         System.out.println("No");
	}
}
}