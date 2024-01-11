package Graph;
//Graph is of two types:
//Directed and Undirected
//Directed-Weighted,Unweighted
//Undirected-Weighted,Unweighted
import java.util.HashSet;

public class Graph_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph g = new Graph(7);

		g.AddEdge(1, 4, 6);
		g.AddEdge(1, 2, 10);
		g.AddEdge(2, 3, 7);
		g.AddEdge(3, 4, 5);
		g.AddEdge(4, 5, 1);
		g.AddEdge(5, 6, 4);
		g.AddEdge(7, 5, 2);
		g.AddEdge(6, 7, 3);
		//g.display();
		System.out.println(g.noofEdge());
		//g.removeEdge(4, 5);
		//g.removevertex(4);
		g.display();
		System.out.println(g.hashpath(1, 6, new HashSet<>()));
		g.printallpath(1,  6, new HashSet<>(), "");
		g.check(3);
		g.BFT();
		System.out.println();
		g.DFT();
		System.out.println();
		System.out.println(g.isCycle());
		System.out.println(g.isConneted());

	}
	//valid graph conneted hota hai


}