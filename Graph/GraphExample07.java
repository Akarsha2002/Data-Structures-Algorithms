package DSA_Using_Java.Graph;
// Number of Islands - Interview Question

public class GraphExample07 {
	
	private int V;
	private int E;
	private int[][] adjMatrix;
	
	GraphExample07(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v) {
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1;
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V+" vertices "+E+" edges"+"\n");
		for(int v = 0; v < V; v++) {
			sb.append(v+": ");
			for(int w : adjMatrix[v]) {
				sb.append("'"+w+"'"+" ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public int numOfIslands(int[][] grid) { // 2D grid is taken as parameter
		int m = grid.length; // number of rows
		int n = grid[0].length; // number of columns
		boolean[][] visited = new boolean[m][n]; // track visited cells
		int numOfIslands = 0; // initial count of islands
		
		// Loops over every cell of the grid
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				
				// If this cell is land (1) and not visited -> new island
				if(!visited[i][j] && grid[i][j] == 1) {
					dfs(grid, i, j, visited); // explore the full island
					numOfIslands++; // count this island
				}
			}
		}
		return numOfIslands;
	}
	
	private void dfs(int[][] grid, int row, int col, boolean[][] visited) {
		// Boundary conditions + already visited + water (0)
		if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length || visited[row][col] || grid[row][col] == 0) {
			return;
		}
		visited[row][col] = true; // Mark current cell as visited
		
		// Explore in all 4 direction
		dfs(grid, row, col-1, visited); // go left
		dfs(grid, row-1, col, visited); // go up
		dfs(grid, row, col+1, visited); // go right
		dfs(grid, row+1, col, visited); // go down
	}
	
	public static void main(String[] args) {
		/*
		 * Q. Given an m × n 2D binary grid, which represents a map of 1's
		 * (land) and 0's (water), return the number of islands. An island 
		 * is surrounded by water and is formed by connecting adjacent lands
		 * horizontally or vertically. You may assume all 4 edges of the grid
		 * are all surrounded by water.
		 * 
		 * Input - {
		 *     0    1    2    3
		 * 0 {'1', '1', '0', '0'},
		 * 1 {'1', '0', '0', '0'},
		 * 2 {'0', '0', '1', '0'},
		 * 3 {'0', '0', '0', '1'}
		 * }
		 *          grid[][]
		 *          
		 * Output - 3
		 * 
		 */
		
		GraphExample07 ge07 = new GraphExample07(4);
		ge07.addEdge(0, 0);
		ge07.addEdge(0, 1);
		ge07.addEdge(1, 0);
		ge07.addEdge(2, 2);
		ge07.addEdge(3, 3);
		
		System.out.println(ge07);
		
		int[][] grid = {
				{1, 1, 0, 0},
				{1, 0, 0, 0},
				{0, 0, 1, 0},
				{0, 0, 0, 1}
		};
		
		System.out.println("Number of Islands: "+ge07.numOfIslands(grid));

	}
}
