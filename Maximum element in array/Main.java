import java.util.Scanner;
class Main
{
   public static int findMax(int A[], int n) 
    { 
      if(n == 1) 
        return A[0]; 
        return Math.max(A[n-1], findMax(A, n-1)); 
    } 
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int num = s.nextInt();
      int i;
       int A[] = new int[num]; 
      for(i=0;i<num;i++)
        A[i]=s.nextInt();
        int n = A.length; 
        System.out.println("Maximum element in the array is "+findMax(A, n));
    }
}