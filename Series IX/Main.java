import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int count = 13,num1 = 2;
      int i;
      System.out.print(num1+" ");
      for(i = 1;i <= num-1; i++)
      {
        num1 += (count * i);
        System.out.print(num1+" ");
        //count = count + 13;
      }
	}
}