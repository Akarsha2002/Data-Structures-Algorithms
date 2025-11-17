package DSA_Using_Java.Graph;

import java.util.LinkedList;

// Recursive Depth First Search (Undirected Graph)

public class GraphExample05 {
	
	private LinkedList<Integer>[] adj;
	private int V;
	private int E;
	
	public GraphExample05(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v = 0; v < V; v++) {
			adj[v] = new LinkedList<>();
		}
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
	
	public void dfs() {
		boolean[] visited = new boolean[V]; // Create a boolean array to keep track of visited vertices
		
		// Loop through all vertices in the graph
		for(int v = 0; v < V; v++) {
			/*
			 * If a vertex is not yet visited, start DFS from that vertex
			 * this ensures we also cover disconnected components
			 */
			if(!visited[v]) {
				dfs(v, visited);
			}
		}
	}
	
	public void dfs(int v, boolean[] visited) {
		visited[v] = true; // Mark the current vertex as visited
		
		// Print the vertex (or perform any other processing task)
		System.out.print(v+" ");
		
		// Explore all neighbors of the current vertex
		for(int w : adj[v]) {
			
			// If neighbors 'w' has not been visited, recursively call DFS
			if(!visited[w]) {
				dfs(w, visited);
			}
		}
	}
	
	public static void main(String[] args) {
		/*
		 * The undirected graph is represented by below
		 * 
		 * 0 -------- 1 
		 * |          |
		 * |          | 
		 * |          |
		 * 3 -------- 2 -------- 4  5
		 * 
		 * 6 vertices 5 edges 
		 * 0: 1 3 
		 * 1: 0 2 
		 * 2: 1 3 4
		 * 3: 2 0
		 * 4: 2
		 * 5:
		 * 
		 * Recursive DFS Output - 0 1 2 3 4 5
		 * 
		 */
		
		GraphExample05 ge051 = new GraphExample05(6);
		ge051.addEdge(0, 1);
		ge051.addEdge(1, 2);
		ge051.addEdge(2, 3);
		ge051.addEdge(3, 0);
		ge051.addEdge(2, 4);
		
		System.out.println(ge051);
		
		ge051.dfs();
		
	}
}
