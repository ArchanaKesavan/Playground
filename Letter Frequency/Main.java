import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
     Scanner s=new Scanner(System.in);
      String a=s.nextLine();
      int i;
      int count[]=new int[200];
      for(i=0;i<a.length();i++)
      {
        count[(int)a.charAt(i)]++;
      }
      for(i = 0;i < 200;i++)
      {
        if(count[i]!=0)
        {
          System.out.println((char)i+""+count[i]);
        }
    }
}
}