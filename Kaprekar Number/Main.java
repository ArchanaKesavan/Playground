import java.util.*;
 public class Main
{
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int square=n*n;
	int sum=0;
    int temp=n,count=0;
    
    while(temp>0){
        temp=temp/10;
        count++;
    }
    while(square>0)
    {
        sum+=(square%Math.pow(10,count));
        square/=10;
    }
    if(sum==n)
    System.out.println("Kaprekar Number");
    else
    System.out.println("Not a Kaprekar Number");
	}
}