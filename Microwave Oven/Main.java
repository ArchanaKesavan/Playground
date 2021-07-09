import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner s = new Scanner(System.in);
      int item = s.nextInt();
      float ht = s.nextFloat();//ht - heating time
      switch(item)
      {
        case 1:
          System.out.println(ht);
          break;
        case 2:
          System.out.println((ht/2)+ht);
          break;
        case 3:
          System.out.println(2*ht);
          break;
        default:
          System.out.println("Number of items is more");
          break;
      }
	}
}