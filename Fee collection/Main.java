import java.util.Scanner;
import java.lang.*;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      String t = s.nextLine();
      //String t2 = "MSDS";
      float tf = s.nextFloat();
      float bf = s.nextFloat();
      float hf = s.nextFloat();
      if(t.equals("MSDS"))
        System.out.printf("%.2f",(tf+bf));
      else if(t.equals("MSH"))
        System.out.printf("%.2f",(tf+hf));
      else if(t.equals("MGSDS"))
        System.out.printf("%.2f",((1.5*tf)+bf));
      else if(t.equals("MGSH"))
        System.out.printf("%.2f",((1.5*tf)+hf));
      else
        System.out.println("Invalid");    
     
    }
}