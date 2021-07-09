import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		// fill your code
      int row, col;
        boolean isUpperTriangular = true;
        Scanner scanner = new Scanner(System.in);
        row = scanner.nextInt();
        col = scanner.nextInt();
        int inputArray[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                inputArray[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < i; j++) {
                if (inputArray[i][j] != 0) {
                    isUpperTriangular = false;
                    break;
                }
            }
            if (!isUpperTriangular) {
                break;
            }
        }
        //8
        if(isUpperTriangular){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
	}
}