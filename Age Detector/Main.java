import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       Scanner obj  =  new Scanner(System.in);
      int by = obj.nextInt();//by-Birth Year
      int cy = obj.nextInt();//cy- Current Year
      if(cy>by)
        System.out.println(cy-by);
      else 
        System.out.println(100-(by-cy));
    }
}