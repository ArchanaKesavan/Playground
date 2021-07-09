import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
      int rows; 
      int columns;
      Scanner scanner = new Scanner(System.in);
      rows = scanner.nextInt();     
      //System.out.println("Enter number of columns: "); 
      columns = scanner.nextInt();      
      int[][] matrix = new int [rows][columns];  
      for (int i = 0; i < rows; i++) {
       
       for (int j = 0; j < columns; j++) {
        matrix[i][j] = scanner.nextInt();
       }
      }
		int[] result = new int[matrix.length];
      for (int i = 0; i < matrix.length; i++) {
       int maxNum = matrix[i][0];
       for (int j = 0; j < matrix[i].length; j++) {
        if(maxNum < matrix[i][j]){
         maxNum = matrix[i][j];
        }
        result[i] = maxNum;
       }   
      }
     
      for (int i = 0; i < result.length; i++) {
          System.out.println("" + result[i]);
      }
	}
}