import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in); 
      int sum;
      int a = sc.nextInt();
		for(int i=1;i<=a;i++)
		{
		    if(i%2!=0)
		         sum = (i*i)-1;
		     else
		         sum = (i*i)-2;
		  System.out.printf("%d ",sum);
		}
	}
}