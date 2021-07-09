import java.util.*;
class Main
{
public static void main(String[] args) 
 {
     Scanner sc = new Scanner(System.in);
 int num = sc.nextInt();
 int a=0,i;
	for(i=1;i<=num;i++)
	{
		if(i % 2 == 1)
		{
			++a;
			for(int j=1;j<num;j++)
				System.out.print(a);
			System.out.print(++a);
		}
		else
		{
			System.out.print(++a);
			--a;
			for(int j=1;j<num;j++)
				System.out.print(a);
		}
	System.out.println();
    }
 }
}