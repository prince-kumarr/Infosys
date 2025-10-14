import java.util.*;
public class btry {
	
	public static void printmatrix(int matrix[][]) {
		System.out.println("The matrix are: ");
		for(int i=0; i< matrix.length; i++) {
			for(int j =0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void transpose(int matrix[][]) {
		int n = matrix.length;
		for(int i =0; i<n; i++) {
			for(int j =i; j<n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i]= temp;
			}
		}
	}
	
	public static void rotate(int matrix[][]) {
		transpose(matrix);
		int n = matrix.length;
		for(int i =0; i<n; i++) {
			int left = 0;
			int right = matrix[i].length-1;
			while(left<right) {
				int temp = matrix[i][left];
				matrix[i][left] = matrix[i][right];
				matrix[i][right]= temp;
				left++;
				right--;
			}
		}	
	}
	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row and columns of matrix: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int matrix[][]= new int[r][c];
		System.out.println("Enter the value of matrix: ");
		for(int i=0; i<r; i++) {
			for(int j =0; j<c; j++) {
				matrix[i][j]= sc.nextInt();
			}
		}
		printmatrix(matrix);
		rotate(matrix);
		printmatrix(matrix);
		
		
		
		sc.close();
	}
}
