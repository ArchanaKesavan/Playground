import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    int stu = s.nextInt();
    int t = s.nextInt();
    int q = stu/t;
    int r = stu%t;
    System.out.println("The number of students in each team is "+q+" and left out is "+r);
  }
}