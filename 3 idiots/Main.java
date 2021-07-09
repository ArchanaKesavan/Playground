import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int x1 = s.nextInt();
    int y1 = s.nextInt();
    int x2 = s.nextInt();
    int y2 = s.nextInt();
    float x,y;
    x = (float)(x1+x2)/2;
    y = (float)(y1+y2)/2;
    System.out.printf("Binoy's house is located at (%.1f,%.1f)",x,y);
  }
}