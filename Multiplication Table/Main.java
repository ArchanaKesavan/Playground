import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner sc = new Scanner (System.in);
      int i,prd;
      int tab = sc.nextInt();
      int lim = sc.nextInt();
      for(i = 1 ; i <= lim ; i++)
      {
        prd = i * tab;
        System.out.println(i+"*"+tab+"="+prd);
      }
    }
}