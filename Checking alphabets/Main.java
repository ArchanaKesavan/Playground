import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);
      char input = obj.next().charAt(0);
      if(input >='a' && input <= 'z' || input >='A' && input <= 'Z')
      {
        if(input =='a'|| input =='e'||input=='i'||input=='o'||input=='u'||
           input =='A'|| input =='E'||input=='I'||input=='O'||input=='U')
          System.out.println("Vowel");
        else
          System.out.println("Consonant");
      }
      else
        System.out.println("Not an alphabet");
    }
}