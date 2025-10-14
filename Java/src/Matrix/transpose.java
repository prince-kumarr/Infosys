package Matrix;
import java.util.*;

public class transpose {
	
	public static void printMatrix(int r, int c , int matrix[][]) {
		System.out.println("The matrix is");
		for(int i =0; i<r; i++) {
			for(int j =0; j<c; j++) {
				System.out.print(matrix[i][j]+ " ");	
			}
			System.out.println();
		}
	}
	
	public static int[][] transeposeMatrix(int r, int c , int matrix[][]){
		int mat[][] = new int[c][r];
		for(int i =0; i<c; i++) {
			for(int j =0; j<r; j++) {
					mat[i][j] = matrix[j][i];
			}
		}
		
		return mat;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows and columns of matrix: ");
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		int mat[][]= new int[r][c];
		
		System.out.println("Enter the value of matrix: ");
		for(int i =0; i<r; i++) {
			for(int j =0; j<c; j++) {
				mat[i][j]= sc.nextInt();
			}
		}
		
		
		int ans[][]=transeposeMatrix(r,c,mat);
		printMatrix(c,r,ans);
		
		
		sc.close();
	}

}
