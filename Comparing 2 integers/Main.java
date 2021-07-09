import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
      int n1 = obj.nextInt();//n1-number 1
      int n2 = obj.nextInt();//n2-number 2
      if(n1 == n2)
        System.out.println(n1+" and "+n2+" are equal");
      else
      {
        if(n1>n2)
          System.out.println(n1+" greater than "+n2);
        else
          System.out.println(n1+" less than "+n2);
      }
    }
}