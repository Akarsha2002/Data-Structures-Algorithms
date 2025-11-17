package DSA_Using_Java.Graph;

import java.util.LinkedList;

// Connected Components (Undirected Graph)

public class GraphExample06 {
	
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	// Arrays used for DFS and connected components
	boolean[] visited; // keeps track of visited vertices
	int[] compId; // stores component ID of each vertex;
	int count = 0; // number of connected components found
	
	public GraphExample06(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v = 0; v < V; v++) {
			adj[v] = new LinkedList<>();
		}
		
		// initialized helper arrays
		this.visited = new boolean[V];
		this.compId = new int[V];
	}
	
	private void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V+" vertices "+E+" edges"+"\n");
		for(int v = 0; v < V; v++) {
			sb.append(v+": ");
			
			for(int w : adj[v]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	// Public DFS function to find all connected components
	public void dfs() {
		for(int v = 0; v < V; v++) {
			if(!visited[v]) {
				// start DFS for each unvisited vertex
				System.out.print("Component "+count+": ");
				dfs(v, visited, compId, count);
				System.out.println();
				count++; // increment component count
			}
		}
	}
	
	// Recursive DFS utility
	private void dfs(int v, boolean[] visited, int[] compId, int count) {
		visited[v] = true; // mark vertex as visited
		compId[v] = count; // assign component id
		
		System.out.print(v+" "); // print the vertex
		
		// Explore all neighbors
		for(int w : adj[v]) {
			if(!visited[w]) {
				dfs(w, visited, compId, count);
			}
		}
	}
	
	// Utility methods
	public int getCountComponent() {
		return count;
	}
	
	public boolean isConnected(int x, int y) {
		return compId[x] == compId[y];
	}
	
	public static void main(String[] args) {
		/*
		 * 0 -------- 1
		 * |
		 * |
		 * |
		 * 3      2 ----- 4    5
		 * 
		 * 6 vertices 3 edges
		 * 0: 1 3 
		 * 1: 0 
		 * 2: 4 
		 * 3: 0 
		 * 4: 2 
		 * 5: 
		 * 
		 * visited[] = [T, T, T, T, T, T]
		 *              0  1  2  3  4  5
		 * 
		 * compId[] = [0, 0, 1, 0, 1, 2]
		 * 
		 * 1. public int getCountComponent() {
		 *         return count;
		 * }
		 * 
		 * 2. public boolean isConnected(int x, int y) {
		 *         return compId[x] == compId[y];
		 * }
		 * 
		 */
		
		GraphExample06 ge06 = new GraphExample06(6);
		ge06.addEdge(0, 1);
//		ge06.addEdge(1, 0);
		ge06.addEdge(2, 4);
		ge06.addEdge(3, 0);
//		ge06.addEdge(4, 2);
		
		System.out.println(ge06);
		
		ge06.dfs();
		
		System.out.println("\n\nNumber of Connected Components: "+ge06.getCountComponent());
		System.out.println("Is 0 connected to 3? "+ge06.isConnected(0, 3));
		System.out.println("Is 2 connected to 5? "+ge06.isConnected(2, 5));
		
	}
}
