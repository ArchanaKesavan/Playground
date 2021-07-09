import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner sc=new Scanner(System.in);
    int Size=sc.nextInt();
    int i;
    int a[]=new int[Size];
    int Even_Sum = 0, Odd_Sum = 0;
    for(i = 0; i < Size; i++)
    {
      a[i]=sc.nextInt();
    }
    for(i = 0; i < Size; i ++)
    {
        if(a[i] % 2 == 0)
        {
 	        Even_Sum = Even_Sum + a[i];
        }
        else
        {
 	        Odd_Sum = Odd_Sum + a[i];
        }
    }
    System.out.printf("The sum of the even numbers in the array is %d ", Even_Sum);
    System.out.printf("\nThe sum of the odd numbers in the array is %d ", Odd_Sum);
  }
}