import java.util.Scanner;
class Main
{
  public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    int n1 = s.nextInt();
    int n2 = s.nextInt();
        int hcf = hcf(n1, n2);

        System.out.println("G.C.D of "+n1+" and "+n2+" is "+hcf);
    }

    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}