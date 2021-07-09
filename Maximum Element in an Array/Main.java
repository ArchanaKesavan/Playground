import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      int arr[] = new int[n];
      int i,max=0;
      for(i=0;i<n;i++)
      {
        arr[i]=s.nextInt();
        if(arr[i]>max)
        {
          max = arr[i];
        }
      }
      System.out.println(max+" is the maximum element in the array");
    }
}