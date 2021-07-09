import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int sum = 0; 
		int[][] a = new int[m][n];
		
		for( int i = 0 ; i < m ; i++ ){
		    for( int  j = 0 ; j < n ; j++ ){
		        a[i][j] = s.nextInt();
		    }
		}
		for( int i = 0 ; i < m ; i++ ){
		    for( int  j = 0 ; j < n ; j++ ){
		        sum += a[i][j];
		    }
		}
		System.out.println(sum);
	}
}