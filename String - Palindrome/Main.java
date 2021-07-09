import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	String a, b = "";
        Scanner s = new Scanner(System.in);
         a = s.nextLine();
        int n = a.length();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
      //System.out.println(b);
        if(a.equals(b))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        } 
	}
}