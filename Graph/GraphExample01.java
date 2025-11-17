package DSA_Using_Java.Graph;
// Adjacency Matrix Implementation (Undirected Graph)

class Graph {
	private int V; // number of vertices in Graph
	private int E; // number of edges in Graph
	private int[][] adjMatrix;
	
	Graph(int nodes){
		this.V = nodes;
		this.E = 0;
		this.adjMatrix = new int[nodes][nodes];
	}
	
	public void addEdge(int u, int v) {
		adjMatrix[u][v] = 1;
		adjMatrix[v][u] = 1; // because  it is an undirected graph
		E++;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder(); // it used to efficiently build the output string
		
		// 1st line: print total vertices and edges in the graph
		sb.append(V + " vertices, "+ E +" edges "+ "\n");
		
		// Loop through each vertex 'v'
		for(int v = 0; v < V; v++) {
			sb.append(v + ": "); // print vertex number (row label in adjacency matrix)
			
			/*
			 * Loop through the adjacency matrix row for vertex 'v'
			 * This row represents which vertices 'v' is connected to
			 */
			for(int w : adjMatrix[v]) {
				/*
				 * Append each connection value (0 or 1)
				 * 1 means there is an edge, 0 means no edge
				 */
				sb.append(w + " ");
			}
			sb.append("\n"); // New line for the next vertex
		}
		
		return sb.toString(); // converts StringBuilder contents to String
	}
}

public class GraphExample01 {
	
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
		 * 4 vertices, 4 edges 
		 * 0: 0 1 0 1 
		 * 1: 1 0 1 0 
		 * 2: 0 1 0 1 
		 * 3: 1 0 1 0 
		 * 
		 */
		
		Graph g = new Graph(4);
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.addEdge(3, 0);
		System.out.println(g);

	}
}
