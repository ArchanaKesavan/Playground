import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int a = n,c = 0;
	    while(a != 0)
	    {
	        a /= 10;
	        c = c+1;
	    }
	    if(c == 3)
	    {
	        if(((n / 10 ) % 10 ) % 3 == 0)
	        {
	            System.out.print("Trendy Number");
	        }
            else
            {
                System.out.print("Not a Trendy Number");
            }
	    }
	    else
	    {
	        System.out.print("Not a Trendy Number");
	    }
    }
}