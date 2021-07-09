import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner s = new Scanner(System.in);
      int a = s.nextInt();//10
      int b = s.nextInt();//20
      a = a - b;//a = 10-20 -10
      b = a + b;//b = -10 + 20 = 10
      a = b - a;//a = 10-(-10) =20
      System.out.print(a+"\n"+b);
    }
}