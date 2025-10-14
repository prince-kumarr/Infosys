package Matrix;

public class spiralMatrix {
	
	public static void printmatrix(int matrix[][]) {
		System.out.println("The matrix are: ");
		for(int i=0; i< matrix.length; i++) {
			for(int j =0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j]+ " ");
			}
			System.out.println();
		}
	}
	
	public static void printSpiralMatrix(int matrix[][] ,int r, int c) {
		int toprow = 0,bottomrow = r-1,leftcol = 0,rightcol=c-1;
		int totalelement = 0;
		while(totalelement < r*c) {
			// toprow --->	leftcol to rightcol
			for(int j=leftcol; j <= rightcol && totalelement < r*c;j++) {
				System.out.print(matrix[toprow][j]+",");
				totalelement++;
			}
			toprow++;
			
			// rightcol --->	toprow to bottomrow
			for(int i=toprow; i <= bottomrow && totalelement < r*c; i++) {
				System.out.print(matrix[i][rightcol]+",");
				totalelement++;
			}
			rightcol--;
			
			//bottomrow -->		rightcol to leftcol
			for(int j=rightcol; j>= leftcol && totalelement < r*c; j--) {
				System.out.print(matrix[bottomrow][j]+",");
				totalelement++;
			}
			bottomrow--;
			
			//leftcol --> 		bottomrow to toprow
			for(int i=bottomrow; i >= toprow && totalelement < r*c; i--) {
				System.out.print(matrix[i][leftcol]+",");
				totalelement++;
			}
			leftcol++;
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {
			    {1,  2,  3,  4,  5},
			    {6,  7,  8,  9, 10},
			    {11, 12, 13, 14, 15},
			    {16, 17, 18, 19, 20},
			    {21, 22, 23, 24, 25}
			};

		 int r = matrix.length;
		 int c = matrix[0].length;
		 
		 printmatrix(matrix);
		 System.out.println("The spiralmatrix is ");
		 printSpiralMatrix(matrix,r,c);
	}

}
