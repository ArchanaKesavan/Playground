import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner h = new Scanner(System.in);
       
    int n=h.nextInt();
    int x=n;
    int c=0;
      System.out.println(x);
    while(n>1)
    {
        if(n%2 == 0)
          n=n/2;
        else
          n=3*n+1;
        System.out.println(n);
        c++;
    }
    System.out.println(c);
    }
}