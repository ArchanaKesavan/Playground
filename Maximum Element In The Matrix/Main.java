import java.util.Scanner; 
class Main {
    public static void main(String args[]) {
        int r,c;
      Scanner sc=new Scanner(System.in);
      r=sc.nextInt();
      c=sc.nextInt();
      int[][] arr=new int[r][c];
      for(int i=0;i<r;i++)
      {
        for(int j=0;j<c;j++)
        {
          arr[i][j]=sc.nextInt();
        }
      }
       // int[][] arr=new int[r][c];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            
        }
        System.out.println(" " + max);
    }
}