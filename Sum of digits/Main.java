import java.util.*; 
  
class Main { 
    
    /* Function to get sum of digits */ 
    static int sumDigits(int no) 
    { 
        return no == 0 ? 0 : no%10 +  
                  sumDigits(no/10) ; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
      Scanner s = new Scanner(System.in);
    int n = s.nextInt(); 
    System.out.println("The sum of digits in " + n +" is " + sumDigits(n)); 
    } 
} 
  