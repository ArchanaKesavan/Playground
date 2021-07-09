import java.util.*;
class Main
{
  public static void main(String args[])
  {
    //type your code
    Scanner sc=new Scanner(System.in);
   
    
    int n=sc.nextInt();
    int arr[]=new int[n];
    int i;
    
    for(i=0;i<n;i++)
   {
        arr[i]=sc.nextInt();
   }
    int pos,ele;
    
     pos=sc.nextInt();
    if (pos>n)
    {
        System.out.printf("Invalid Input\n");
    }
    else
    {
        
         ele=sc.nextInt();
        
        i=0;
        while(i<n)
        {
            if (i==pos-1)
            {
                System.out.printf("%d\n%d\n",ele,arr[i]);
            }
            else
            {
                System.out.printf("%d\n", arr[i]);
            }
            i=i+1;
        }
    }
  }
}