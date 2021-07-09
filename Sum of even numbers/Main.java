import java.util.*; 
import java.lang.*; 
import java.io.*; 
class Main 
{ 
static void SumOfEven(int arr[],	 
					int i, int sum) 
{ 
	if (i < 0) 
	{ 
		System.out.print("Sum of even numbers "+sum); 
		return; 
	} 

	if ((arr[i]) % 2 == 0) 
	{ 
		sum += (arr[i]); 
	} 
	SumOfEven(arr, i - 1, sum); 
} 
public static void main (String[] args) 
			throws java.lang.Exception 
{ 
   Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int arr[] = new int[n];
         for(int i=0;i<n;i++)
        arr[i] = in.nextInt();
	int sum = 0; 

	SumOfEven(arr, n - 1, sum); 
} 
} 