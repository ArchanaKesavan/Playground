import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      String b=s.nextLine();
    String r = "";
 for(int i = b.length() - 1; i >= 0; i--)
 {
 r = r + b.charAt(i);
 }
      if(a.equals(r))
      {
        System.out.println("It is same");
      }
      else
      {
         System.out.println("It is not same");
      }
      
    }
}
   