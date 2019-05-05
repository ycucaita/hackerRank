import java.util.*;
import java.util.stream.Stream;

public class MainDaigonalDiff {

	public static void main(String[] args) {
		//int[][] arr = new int[5][3];

		/*arr[0][0] = 3;

		arr[1][0] = 11;
		arr[1][1] = 2;
		arr[1][2] = 4;

		// arr[2][0] = 0;
		// arr[2][1] = 0;
		arr[2][2] = 3;

		arr[3][0] = 4;
		arr[3][1] = 5;
		arr[3][2] = 6;

		arr[4][0] = 10;
		arr[4][1] = 8;
		arr[4][2] = -12;*/
		
		int[][] arr = new int[10][9];
		
		arr[0][0] = 9;
		
		arr[1][0] = 6;
		arr[1][1] = 6;
		arr[1][2] = 7;
		arr[1][3] = -10;
		arr[1][4] = 9;
		arr[1][5] = -3;
		arr[1][6] = 8;
		arr[1][7] = 9;
		arr[1][8] = -1;
		
		arr[2][0] = 9;
		arr[2][1] = 7;
		arr[2][2] = -10;
		arr[2][3] = 6;
		arr[2][4] = 4;
		arr[2][5] = 1;
		arr[2][6] = 6;
		arr[2][7] = 1;
		arr[2][8] = 1;
		
		
		arr[3][0] = -1;
		arr[3][1] = -2;
		arr[3][2] = 4;
		arr[3][3] = -6;
		arr[3][4] = 1;
		arr[3][5] = -4;
		arr[3][6] = -6;
		arr[3][7] = 3;
		arr[3][8] = 9;
		
		
		arr[4][0] = -8;
		arr[4][1] = 7;
		arr[4][2] = 6;
		arr[4][3] = -1;
		arr[4][4] = -6;
		arr[4][5] = -6;
		arr[4][6] = 6;
		arr[4][7] = -7;
		arr[4][8] = 2;

		arr[5][0] = -10;
		arr[5][1] = -4;
		arr[5][2] = 9;
		arr[5][3] = 1;
		arr[5][4] = -7;
		arr[5][5] = 8;
		arr[5][6] = -5;
		arr[5][7] = 3;
		arr[5][8] = -5;
		
		arr[6][0] = -8;
		arr[6][1] = -3;
		arr[6][2] = -4;
		arr[6][3] = 2;
		arr[6][4] = -3;
		arr[6][5] = 7;
		arr[6][6] = -5;
		arr[6][7] = 1;
		arr[6][8] = -5;
		
		arr[7][0] = -2;
		arr[7][1] = -7;
		arr[7][2] = -4;
		arr[7][3] = 8;
		arr[7][4] = 3;
		arr[7][5] = -1;
		arr[7][6] = 8;
		arr[7][7] = 2;
		arr[7][8] = 3;
		
		arr[8][0] = -3;
		arr[8][1] = 4;
		arr[8][2] = 6;
		arr[8][3] = -7;
		arr[8][4] = -7;
		arr[8][5] = -8;
		arr[8][6] = -3;
		arr[8][7] = 9;
		arr[8][8] = -6;
		
		arr[9][0] = -2;
		arr[9][1] = 0;
		arr[9][2] = 5;
		arr[9][3] = 4;
		arr[9][4] = 4;
		arr[9][5] = 4;
		arr[9][6] = -3;
		arr[9][7] = 3;
		arr[9][8] = 0;

		int acumFirstDiag = 0;
		int acumSectDiag = 0;
		int acumTemp = 0;
		boolean isWrongValue = false;

		int limInitial = 0;
		int limFinal = arr[0].length - 1;

		for (int row = 0; row < arr.length; row++) {

			acumTemp = 0;
			if (isWrongValue) {
				isWrongValue = false;
			}

			for (int col = 0; col < arr[row].length; col++) {

				if (arr[col].length > col+1 &&   (arr[row][col] == 0 && arr[row][col + 1] == 0)) {
					isWrongValue = true;
					break;

				} else {

					if (col == limInitial && !isWrongValue) {
						acumTemp = arr[row][col];
					}

					if (col == limFinal) {
						acumSectDiag = acumSectDiag + arr[row][col];
					}

					if (col == arr[col].length - 1) {
						acumFirstDiag = acumFirstDiag + acumTemp;
						limFinal--;
						limInitial++;
					}

				}
			}
		}
		System.out.println("diagonal first" + acumFirstDiag);
		System.out.println("diagonal second" + acumSectDiag);
		int value = acumFirstDiag-acumSectDiag;
		
		System.out.println("absolut Value"+Math.abs(value));

	}

}
