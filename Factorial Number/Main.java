import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        int num,sum=1;
      Scanner a=new Scanner(System.in);
      num=a.nextInt();
      int i=1,count=0;
      while(sum<num)
      {
        sum=sum*i;
        if(sum==num)
        {
          count=1;
          break;
        }
      /*  else
        {
          ount=0;
        }*/
        i++;
      }
      if(count==1)
      {
        System.out.print("Yes");
      }
      else
      {
        System.out.print("No");
      }
    }
}