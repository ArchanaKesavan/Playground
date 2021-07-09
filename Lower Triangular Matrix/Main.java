import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner sc=new Scanner(System.in);


		int m=sc.nextInt();
		int A[][]=new int[m][m];

		for(int i=0;i<m;i++)
		{
			for(int j=0;j<m;j++)
			{
				A[i][j]=sc.nextInt();
			}
        }
		int p=0;

		for(int i=0;i<m;i++)
		{
			for(int j=i+1;j<m;j++)
			{
				if(A[i][j]!=0) 
				{
					p=1;
					break;
				}
			}
		}

		if(p==0)
			System.out.println("yes");
		else
			System.out.println("no");
	}
}