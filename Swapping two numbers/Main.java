import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
      int a = s.nextInt();//20
      int b = s.nextInt();//10
      int temp;
      temp = a;//temp = 20
      a = b; //a = 10
      b = temp; //b= 20
      System.out.print(a+"\n"+b);
    }
}