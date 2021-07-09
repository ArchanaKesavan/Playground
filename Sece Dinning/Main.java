import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
    String str1 = s.nextLine();
    String str2 = "front";
    String str3 = "rear";
    int b = s.nextInt();
    if((str1.equals(str2) == true) && (b==1)){
        System.out.print("Left Handed");   
    }
    else if((str1.equals(str3) == true) && (b==1)){
        System.out.print("Right Handed");
    }
    else if((str1.equals(str2) == true) && (b==0))
    {
        System.out.print("Right Handed");   
    }
    else if((str1.equals(str3) == true) && (b==0)){
        System.out.print("Left Handed");
    }
    else{
        System.out.print("Left Handed");
    }
	}
}
