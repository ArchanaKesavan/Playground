import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner s = new Scanner(System.in);
		int m = s.nextInt();
		int n = s.nextInt();
		int[][] a = new int[m][n];
		for( int i = 0 ; i < m ; i++ ){
		    for( int j = 0 ; j < n ; j++ ){
		        a[i][j] = s.nextInt();       
		    }
		}
		
		int max1 = a[0][0];
		for( int i = 0 ; i < n ; i++ ){
		    for( int j = 0 ; j < m ; j++ ){
		        if( a[j][i] > max1 )
		            max1 = a[j][i];
		    }
		    System.out.println(max1);
		    max1 = 0;
		}
	}
}