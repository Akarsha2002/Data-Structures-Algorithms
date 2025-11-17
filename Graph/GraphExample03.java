package DSA_Using_Java.Graph;

import java.util.LinkedList;
import java.util.Queue;

// Breadth First Search (Undirected Graph)
// Also called Level Order Traversal

public class GraphExample03 {
	
	private LinkedList <Integer> adj[];
	private int V; // number of vertices
	private int E; // number of edges
	
	public GraphExample03(int nodes) {
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
		sb.append(V + " vertices, "+E+" edges "+"\n");
		for(int v = 0; v < V; v++) {
			sb.append(v+": ");
			for(int w : adj[v]) {
				sb.append(w+" ");
			}
			sb.append("\n");
		}
		
		return sb.toString();
	}
	
	public void bfs(int s) { // takes starting value as parameter
		
		// Create a visit array to track which vertices have been visited
		boolean[] visited  = new boolean[V]; // V is total number of vertices 
		Queue<Integer> q = new LinkedList<>(); // Create a queue for BFS (FIFO)
		
		// Mark the starting vertex as visited and enqueue it
		visited[s] = true;
		q.offer(s);
		
		// Loops until the queue becomes empty
		while(!q.isEmpty()) {
			int u = q.poll(); // Dequeue a vertex from the queue
			System.out.print(u+" "); // Print vertex (Process it)
			
			// Traverse all the adjacent vertices of 'u'
			for(int v : adj[u]) { // adj[u] is the adjacency list of vertex 'u'
				if(!visited[v]) { // If neighbor 'v' is not visited yet
					visited[v] = true; // Mark 'v' as visited
					q.offer(v); // Enqueue 'v' so it will be processed later
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
		 * BFS Output - 0 1 3 2 4
		 * 
		 */
		
		GraphExample03 ge03 = new GraphExample03(5);
		ge03.addEdge(0, 1);
		ge03.addEdge(1, 2);
		ge03.addEdge(2, 3);
		ge03.addEdge(3, 0);
		ge03.addEdge(2, 4);
		System.out.println(ge03);
		
		ge03.bfs(0);
		
	}
}
