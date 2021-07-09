import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner s = new Scanner(System.in);
      float a = s.nextFloat();
      float b = s.nextFloat();
      float c = s.nextFloat();
      float d = s.nextFloat();
      float e = s.nextFloat();
      float avg = (a+b+c+d+e)/5;
      System.out.printf("%.2f",avg);
    }
}