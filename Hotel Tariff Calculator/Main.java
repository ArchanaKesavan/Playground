import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
      int month = s.nextInt();
      float rent = s.nextInt();
      int day = s.nextInt();
     switch(month)
     {
       case 1:
       case 2:
       case 3:
       case 7:
       case 8:
       case 9:
       case 10:
         System.out.printf("%.2f",rent*day);
         break;
       case 4:
       case 5:
       case 6:
       case 11:
       case 12:
         System.out.printf("%.2f",(rent+(0.2*rent))*day);
         break;
       default:
         System.out.println("Invalid Input");
         break;
     }
	}
}