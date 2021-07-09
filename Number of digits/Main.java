import java.util.Scanner;
public class Main 
{
    int sum = 0;
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        Main obj = new Main();
        int a = obj.add(n);
        System.out.println("The number of digits in " + n + " is " + add(n));
    }
    static int add(int n)
    {
        if(n == 0)
        {
            return 0;
        }
        else
        {
             return 1 + add(n / 10);
        }
 
    }
}