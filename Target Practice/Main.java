import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
        int sum = 0, n, count = 0;     
        int a = obj.nextInt();
        while(sum < a)
        {
            n = obj.nextInt();
            sum = sum+n;
            count++;
        }
        System.out.println("The number of turns is "+count);
    }
}