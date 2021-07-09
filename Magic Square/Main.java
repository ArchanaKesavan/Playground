import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[][] a = new int[n][n];
		int sum1=0,sum2=0;
		for( int i = 0 ; i < n ; i++ ){
		    for( int j = 0 ; j < n ; j++ ){
		        a[i][j] = s.nextInt();       
		    }
		}
		
	    for( int i = 0 ; i < n ; i++ ){
		    for( int j = 0 ; j < n ; j++ ){
		        if ( i == j)
		            sum1 += a[i][j];
		           
		        if( i + j == ( n - 1 ) )
		            sum2 += a[i][j];
		    }
		}
		if( sum1 != sum2 )
		    System.out.println("no");
		else{
		    int s1=0,s2=0,s3=0;
		    int a1=0,a2=0,a3=0;
		    for( int i = 0 ; i < n ; i++ ){
		        for( int j = 0 ; j < n ; j++ ){
		            if( i == 0 )
		                s1+= a[i][j];
		            if( i == 1 )
		                s2 += a[i][j];
		            if( i == 2 )
		                s3 += a[i][j];
		            if( j == 0 )
		                a1 += a[i][j];
		            if( j == 1 )
		                a2 += a[i][j];
		            if( j == 2 )
		                a3 += a[i][j];
		        }
		    }
		    if( s1 == a1 && s2 == a2 && s3 == a3 )
		           System.out.println("yes");
		    else
		            System.out.println("no");
		}
	}
}