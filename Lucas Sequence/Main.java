import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
      int a=0,b=0,c=1,i,r;
      int n = sc.nextInt();
      System.out.print(a+" "+b+" "+c+" ");
      for(i = 4;i<=n;i++)
      {
        r = a+b+c;
        System.out.print(r+" ");
        a = b;
        b = c;
        c = r;
      }
    }
}