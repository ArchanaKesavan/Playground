import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int input = s.nextInt();
      String out = (input%2 == 0)?("Even"):("Odd");
      System.out.print(out);
    }
}