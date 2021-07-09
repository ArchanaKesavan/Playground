import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        float x = s.nextFloat();
        int y = s.nextInt();
        float z = (float)y*12;
        float a = z-x;
        if(a==0.0)
        {
          System.out.println("No profit nor loss");
        }
        else if(a>0.0)
        {
          System.out.println("Profit : Rs."+ String.format("%.2f", (a)));
        }
        else
          System.out.println("Loss : Rs."+ String.format("%.2f", (-(a))));
      
          
      
    }
}