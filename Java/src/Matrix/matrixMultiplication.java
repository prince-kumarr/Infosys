package Matrix;
import java.util.*;
public class matrixMultiplication {
	
	public static void multiply(int r1,int c1, int a[][],int r2, int c2,int b[][]) {
		if( c1 != r2) {
			System.out.println("Multiplication not possible due to dimesion");
			return;	
		}
		
		int mult[][] = new int[r1][c2];
		
		for(int i =0;i<r1; i++) {
			for(int j=0; j<c2;j++) {
				for(int k =0; k<c1; k++) {
					mult[i][j]+= a[i][k]*b[k][j];
				}
			}
		}
		
		//print matrix-----
		System.out.println("The matrix after the multilpication");
		for(int i =0; i<r1; i++) {
			for(int j =0; j<c2; j++) {
				System.out.print(mult[i][j]+ " ");	
			}
			System.out.println();
		}		
	}
	
	public static void add(int r1,int c1, int arr1[][],int r2, int c2,int arr2[][]) {
		if(r1 != r2 || c1 != c2) {
			System.out.println("The dimension of this matrix are not same");
			return;
		}
		
		int sum[][]= new int[r1][c1];
		
		for(int i =0; i<r1; i++) {
			for(int j =0; j<c1; j++) {
				sum[i][j]= arr1[i][j]+arr2[i][j];	
			}
		}
		
		System.out.println("The matrix after the addition");
		for(int i =0; i<r2; i++) {
			for(int j =0; j<c2; j++) {
				System.out.print(sum[i][j]+ " ");	
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// matrix 1
		System.out.println("Enter the rows and columns of matrix 1");
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		int arr[][]= new int[r1][c1];
		
		System.out.println("Enter the values of matrix 1");
		for(int i =0; i<r1; i++) {
			for(int j =0; j<c1; j++) {
				arr[i][j]= sc.nextInt();		
			}
		}
		// matrix 2
		System.out.println("Enter the rows and columns of matrix 2");
		int r2 = sc.nextInt();
		int c2 = sc.nextInt();
		
		int arr2[][]= new int[r2][c2];
		
		System.out.println("Enter the values of matrix 2");
		for(int i =0; i<r2; i++) {
			for(int j =0; j<c2; j++) {
				arr2[i][j]= sc.nextInt();		
			}
		}
		
		// printing the matrix ...
		System.out.println("The matrix 1 is");
		for(int i =0; i<r1; i++) {
			for(int j =0; j<c1; j++) {
				System.out.print(arr[i][j]+ " ");	
			}
			System.out.println();
		}
		
		System.out.println("The matrix 2 is");
		for(int i =0; i<r2; i++) {
			for(int j =0; j<c2; j++) {
				System.out.print(arr2[i][j]+ " ");	
			}
			System.out.println();
		}
		
		//add(r1,c1,arr,r2, c2,arr2);
		multiply(r1,c1,arr,r2, c2,arr2);
		sc.close();
	}
}
