package test.test2.demo;
public class MatrixRotate {
	
	public static void main(String[] args) {
		int[][] arr= {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		rotate(arr);
	}
    public static void rotate(int[][] matrix) {
        int[][] c = new int[matrix.length][matrix.length];
        print2DArray(matrix);
        int k = matrix.length;
        for(int i=0;i<k/2;i++)
        {
            for(int j=i;j<k-i-1;j++)
            {
                int d=matrix[i][j];
                matrix[i][j]=matrix[k-j-1][i];
                matrix[k-j-1][i]=matrix[k-i-1][k-j-1];
                matrix[k-i-1][k-j-1]=matrix[j][k-i-1];
                matrix[j][k-i-1]=d;
            }
        }

        print2DArray(matrix);
     }
    
    public static void print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
//                matrix[i][j] = arr[i][j];
            }
            System.out.println(); // Move to the next line after each row
        }
        System.out.println("________"); // Move to the next line after each row

    }
}