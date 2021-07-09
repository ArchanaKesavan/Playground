import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	  Scanner sc = new Scanner(System.in);
      int row = sc.nextInt();
      int i,j;
       for (i = (row*2)-1; i >= 1; i=i-2) 
        {
            for (j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }  
            System.out.println();
        }
	}
}