import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		String a,b;
      Scanner sc=new Scanner(System.in);
      a=sc.nextLine();
      b=sc.nextLine();
      if(a.equals(b)==true)
      {
        System.out.print("Strings are same");
      }
      else
      {
        System.out.print("Strings are not same");
      }
	}
}