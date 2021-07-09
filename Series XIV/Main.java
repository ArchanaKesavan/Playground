import java.util.*;
 public class Main
{
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=2,i=1;
    
 while(n>0){ 
       System.out.print(a+" ");
       a=(a+a)+1;
   i++;
    n--;
   }
	}
}