import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc = new Scanner(System.in);
      float x=sc.nextFloat();
      float y=sc.nextFloat();
      float z=sc.nextFloat();
      float a=x/3600;
      float b=a*z;
      if(y<b)
        System.out.print("Yes");
      else
        System.out.print("No");
	}
}