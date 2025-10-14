package Matrix;

public class makeSpiralMatrix {
	
	public static void printSprial(int matrix[], int n) {
		int r = 
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
		// TODO Auto-generated method stub

	}

}
