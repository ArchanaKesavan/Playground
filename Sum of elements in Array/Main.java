import java.util.*;
public class Main {
 
     private static int calculateSum(int arr[], int n) {
 
         //base or terminating condition
         if (n <= 0) {
            return 0;
          }
 
          //Calling method recursively
          return calculateSum(arr, n-1 ) + arr[n-1];
       }
 
      public static void main(String[] args) {
 
         //int arr[] = {2, 5, 6, 8, 9, 12};
         Scanner in = new Scanner(System.in);
      	int n = in.nextInt();
      	int arr[] = new int[n];
         for(int i=0;i<n;i++)
        arr[i] = in.nextInt();
         int sum = calculateSum(arr, arr.length);
 
          System.out.println("The sum of the elements in the array is "+sum);
      }
 
}