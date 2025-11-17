package DSA_Using_Java.Graph;

import java.util.LinkedList;

// Adjacency Linked List Implementation (Undirected Graph)

public class GraphExample02 {

	private LinkedList <Integer>[] adj;
	private int V; // number of vertices
	private int E; // number of edges
	
	public GraphExample02(int nodes) {
		this.V = nodes;
		this.E = 0;
		this.adj = new LinkedList[nodes];
		for(int v = 0; v < V; v++) {
			adj[v] = new LinkedList<>();
		}
	}
	
	public void addEdge(int u, int v) {
		adj[u].add(v);
		adj[v].add(u);
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(V + " vertices " + E + " edges " + "\n");
		for(int v = 0; v < V; v++) {
			sb.append(v + ": ");
			for(int w : adj[v]) {
				sb.append(w + " ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		/*
		 * The undirected graph is represented by below
		 * 
		 * 0 -------- 1
		 * |          |
		 * |          |
		 * |          |
		 * 3 -------- 2
		 * 
		 * 4 vertices 4 edges 
		 * 0: 1 3 
		 * 1: 0 2 
		 * 2: 1 3 
		 * 3: 2 0 
		 * 
		 */
		
		GraphExample02 ge02 = new GraphExample02(4);
		ge02.addEdge(0, 1);
		ge02.addEdge(1, 2);
		ge02.addEdge(2, 3);
		ge02.addEdge(3, 0);
		System.out.println(ge02);

	}
}
