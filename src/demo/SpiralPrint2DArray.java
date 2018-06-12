package demo;

public class SpiralPrint2DArray {
	public static void main(String[] args) {
		int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		SpiralPrint2DArray spiralPrint2DArray = new SpiralPrint2DArray();
		spiralPrint2DArray.printSpiral(arr, 3, 4);
	}
	
	public void printSpiral(int arr[][], int row, int column) {
		int topRow = 0, bottomRow = row-1, leftColumn=0, rightColumn=column-1, dir=0;
		while(topRow<=bottomRow && leftColumn<=rightColumn) {
			if(dir==0) {
				for(int i=leftColumn;i<=rightColumn;i++) {
					System.out.print(arr[topRow][i]+", ");
				}
				topRow++;
				dir = 1;
			}
			else if(dir==1) {
				for(int i=topRow;i<=bottomRow;i++) {
					System.out.print(arr[i][rightColumn]+", ");
				}
				rightColumn--;
				dir = 2;
			}
			else if(dir==2) {
				for(int i=rightColumn;i>=leftColumn;i--) {
					System.out.print(arr[bottomRow][i]+", ");
				}
				bottomRow--;
				dir = 3;
			}
			else if(dir==3) {
				for(int i=bottomRow;i>=topRow;i--) {
					System.out.print(arr[i][leftColumn]+", ");
				}
				leftColumn++;
				dir = 0;
			}
		}
	}
}
