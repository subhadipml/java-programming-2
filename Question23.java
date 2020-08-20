import java.util.Iterator;
import java.util.LinkedList;


//Check if a given graph is a tree or not


public class Question23 { 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency List 

	// Constructor 
	Question23(int v) { 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) {
			adj[i] = new LinkedList(); 
		}
	} 

	void addEdge(int v,int w) { 
		adj[v].add(w); 
		adj[w].add(v); 
	} 

	Boolean isCyclicUtil(int v, Boolean visited[], int parent) { 
		visited[v] = true; 
		Integer i; 

		Iterator it = adj[v].iterator(); 
		while (it.hasNext()) 
		{ 
			i = (Integer) it.next(); 
			if (!visited[i]) 
			{ 
				if (isCyclicUtil(i, visited, v)) {
					return true; 
				}
			} else if (i != parent) {
				return true; 
			}
		} 
		return false; 
	} 

	Boolean isTree() { 
		Boolean visited[] = new Boolean[V]; 
		for (int i = 0; i < V; i++) {
			visited[i] = false; 
		}
		
		if (isCyclicUtil(0, visited, -1)) {
			return false; 
		}

		for (int u = 0; u < V; u++) {
			if (!visited[u]) { 
				return false;
			}
		}
		return true; 
	} 

	public static void main(String args[]){ 
		Question23 g1 = new Question23(5); 
		g1.addEdge(1, 0); 
		g1.addEdge(0, 2); 
		g1.addEdge(0, 3); 
		g1.addEdge(3, 4); 
		if (g1.isTree()) {
			System.out.println("Graph is Tree"); 
		}else {
			System.out.println("Graph is not Tree");
		}
	} 
} 