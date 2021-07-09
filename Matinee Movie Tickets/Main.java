import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
      int age = s.nextInt();
      float st = s.nextFloat();//st - Show timing
      if(age > 13)
      {
        if(st >= 13.30 && st <= 17.59)//matinee show timing 13.30 to 17.59 
          	System.out.println("$5.00");//evening show starts at 18.00
        else
          System.out.println("$8.00");
      }
      else
         {
        if(st >= 13.30 && st <= 17.59)//matinee show timing 13.30 to 17.59 
          	System.out.println("$2.00");//evening show starts at 18.00
        else
          System.out.println("$4.00");
      }
	}
}