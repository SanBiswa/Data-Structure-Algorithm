package biswa.dsa.DataStructures.Arrays.TwoD;

/*
 * Given a binary 2D array, where each row is sorted. Find the row with the maximum number of 1s.
 * Input matrix : 0 1 1 1
 *                0 0 1 1
 *                1 1 1 1 
 *                0 0 0 0
 * Output: 2             
 */
public class RowWithMax1s {

	public static void main(String[] args) {
		int[][] matrix = { { 0, 1, 1, 1 }, { 0, 0, 1, 1 }, { 1, 1, 1, 1 }, { 0, 0, 0, 1 } };
		approach1(matrix);
		approach2(matrix);
		approach3(matrix);
	}

	// TC: O(m*n)
	static void approach1(int[][] matrix) {
		int max = 0, index = 0;
		for (int i = 0; i < matrix.length; i++) {
			int count = 0;
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 1)
					count++;
			}
			if (count > max) {
				max = count;
				index = i;
			}
		}
		System.out.println(index);
	}

	// TC: O(m log n)
	static void approach2(int[][] matrix) {
		int row = -1, outMax = -1;
		for (int i = 0; i < matrix.length; i++) {
			int left = 0, right = matrix[i].length - 1, inMax = -1;
			while (left <= right) {
				int mid = (left + right) / 2;
				if (matrix[i][mid] == 1) {
					inMax = matrix[i].length - mid;
					right = mid - 1;
				} else {
					left = mid + 1;
				}
			}
			if (inMax > outMax) {
				row = i;
				outMax = inMax;
			}
		}
		System.out.println(row);
	}

	// TC: O(m+n)
	// It will only work if the column's and row's of a matrix are same means if it is a square.
	static void approach3(int[][] mat) {
		int row = 0, col = 3, maxRow = -1;
		while (row < 4 && col >= 0) {
			if (mat[row][col] == 0) {
				row++;
			} else {
				maxRow = row;
				col--;
			}
		}
		System.out.println(maxRow);
	}
}
