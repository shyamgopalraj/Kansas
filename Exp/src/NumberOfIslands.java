
public class NumberOfIslands {

	boolean[][] visited;

	public int numIslands(char[][] grid) {
		if(grid.length == 0)
			return 0;
		int numberOfIslands = 0;
		visited = new boolean[grid.length][grid[0].length];
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid[0].length; col++) {
				if (grid[row][col] == '1' && !visited[row][col]) {
					findIslands(row, col,grid);
					numberOfIslands++;
				}
			}
		}
		return numberOfIslands;
	}

	private void findIslands(int r, int c, char[][] grid) {
		int[] row = {0, 1, 0, -1};
		int[] col = {1, 0, -1, 0};

		for (int i = 0; i < row.length; i++) {
			int newRowIndex = r + row[i];
			int newColIndex = c + col[i];

			if ((newRowIndex >= 0 && newRowIndex < grid.length) && (newColIndex >= 0 && newColIndex < grid[0].length)
					&& (grid[newRowIndex][newColIndex] == '1') && !visited[newRowIndex][newColIndex]) {
				visited[newRowIndex][newColIndex] = true;
				findIslands(newRowIndex, newColIndex, grid);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
