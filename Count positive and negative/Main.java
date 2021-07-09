import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int i;
      int pos = 0,neg = 0;
     for(i = 1 ; i <= num ; i++)
     {
       int num1 = sc.nextInt();
       if(num1 >= 0)
         pos++;
       else
         neg++;
     }
      System.out.print("Number of positive numbers is "+pos+" and the number of negative numbers is "+neg);
    }
}