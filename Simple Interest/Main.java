import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int p = s.nextInt();
      int n = s.nextInt();
      float r = s.nextFloat();
      System.out.printf("%.2f",(p*n*r)/100);
    }
}