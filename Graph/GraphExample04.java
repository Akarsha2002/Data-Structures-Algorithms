package DSA_Using_Java.Graph;

import java.util.LinkedList;
import java.util.Stack;

// Depth First Search (Undirected Graph)

public class GraphExample04 {
	
	private LinkedList<Integer>[] adj;
	private int V; // number of vertices
	private int E; // number of edges
	
	public GraphExample04(int nodes) {
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
		sb.append(V+" vertices, "+E+" edges"+"\n");
		for(int v = 0; v < V; v++){
			sb.append(v+": ");
			for(int w : adj[v]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public void dfs(int s) { // take stating point of the parameter
		// Array to track visited vertices
		boolean[] visited = new boolean[V]; // V = number of vertices
		
		// Use a Stack instead of recursion for DFS
		Stack<Integer> stack = new Stack<>();
		stack.push(s); // Start DFS by pushing the starting node
		
		// Run until stack becomes from the stack
		while(!stack.isEmpty()) {
			int u = stack.pop(); // Take the top element from the stack
			
			// If this vertex has not been visited yet
			if(!visited[u]) {
				visited[u] = true; // Mark as visited
				System.out.print(u+" "); // Print the vertex (processing step)
				
				// Traverse all neighbors of vertex 'u'
				for(int v : adj[u]) {
					
					// If neighbor 'v' is not visited
					if(!visited[v]) {
						stack.push(v); // Push neighbor into stack
					}
				}
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
		 * 3 -------- 2 -------- 4
		 * 
		 * 5 vertices 5 edges 
		 * 0: 1 3 
		 * 1: 0 2 
		 * 2: 1 3 4
		 * 3: 2 0
		 * 4: 2
		 * 
		 * DFS Output - 0 3 2 4 1 
		 * 
		 */
		
		GraphExample04 ge04 = new GraphExample04(5);
		ge04.addEdge(0, 1);
		ge04.addEdge(1, 2);
		ge04.addEdge(2, 3);
		ge04.addEdge(3, 0);
		ge04.addEdge(2, 4);
		System.out.println(ge04);
		
		ge04.dfs(0);
	}
}
