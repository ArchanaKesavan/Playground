import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a=0,b=1;
       int c=a+b;
       while(n!=3)
       {
           a=b;
           b=c;
           c=a+b;
           n--;
       }
       System.out.println(c);
    }
}
    