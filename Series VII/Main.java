import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int i = 1;
	float even = 2;
    float odd = 1;
	for(i = 1;i <= n; i++)
	{
	    if(i == 1)
	    {
	      System.out.print("1 ");
	      i++;
	    }
	    if(i % 2 == 0)
	    {
	       System.out.print(even+" ");
	       even = even * 3;
	    }
	    else
	    {
	        odd = odd * 3;
	        System.out.print(odd+" ");
	    }
	}
	}
}