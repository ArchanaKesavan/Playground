import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      String str=a.replaceAll("[AaEeIiOoUu]","");
      System.out.println(str);
        
    }
}