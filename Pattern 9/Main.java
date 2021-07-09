import java.io.*; 
import java.util.*; 
public class Main 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); 
		int space; 
		int i, j, lterm, rterm; 
		lterm = 1; 
		rterm = num * num + 1; 
		for (i = num; i > 0; i--)
		{ 
			for (space = num; space > i; space--)		 
				System.out.print(" "); 
			for (j = 1; j <= i; j++)
			{ 
				System.out.print(lterm); 
				System.out.print("*"); 
				lterm++; 
			} 
			for (j = 1; j <= i; j++) 
			{ 
				System.out.print(rterm); 
				if (j < i) 
					System.out.print("*"); 
				rterm++; 
			} 
			rterm = rterm - (i - 1) * 2 - 1; 
			System.out.println(); 
		} 
	} 
} 
