import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for( int i = 0 ; i < n ; i++ )
            a[i] = s.nextInt();
        
        int max = a[0],low = a[0];
        for( int i = 0 ; i < n ; i++ ){
                if( a[i] > max)
                    max = a[i];
                if( a[i] < low )
                    low = a[i];
        }
        int range = max - low;
        System.out.println("The range of the array is "+range);
  }
}