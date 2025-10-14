

import java.util.Scanner;

public class pratice {

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
		System.out.println("The matrix is: ");
		for(int i =0; i<mat.length; i++) {
			for(int j =0; j<mat[i].length; j++) {
				System.out.print(mat[i][j]+ " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
