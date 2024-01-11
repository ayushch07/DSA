package Graph;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

public class Djkstra_Algo {
	HashMap<Integer, HashMap<Integer, Integer>> map;

	public Djkstra_Algo(int v) {
		
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void addEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public class DijkstraPair {

		int vtx;
		String acqpath;
		int cost;

		public DijkstraPair(int vtx, String acqpath, int cost) {
			this.vtx = vtx;
			this.acqpath = acqpath;
			this.cost = cost;
		}

		@Override
		public String toString() {
			return this.vtx + " via " + this.acqpath + " @ " + this.cost;
		}

	}

	public void Dijkstra() {
		PriorityQueue<DijkstraPair> pq = new PriorityQueue<>(new Comparator<DijkstraPair>() {
			@Override
			public int compare(DijkstraPair p1, DijkstraPair p2) {
				return p1.cost - p2.cost;
			}

		});

		HashSet<Integer> visited = new HashSet<>();
		pq.add(new DijkstraPair(1, "1", 0));
		while (!pq.isEmpty()) {
			
			DijkstraPair np = pq.remove();
			if(visited.contains(np.vtx)) {
				continue;
			}
			visited.add(np.vtx);
			System.out.println(np);
			
			for(int nbrs : map.get(np.vtx).keySet()) {
				if(!visited.contains(nbrs)) {
					int cost= np.cost+map.get(np.vtx).get(nbrs);
					DijkstraPair ndp = new DijkstraPair(nbrs, np.acqpath+nbrs, cost);
					pq.add(ndp);
					
				}
			}

		}
	}
		public static void main(String[] args) {
			Djkstra_Algo g = new Djkstra_Algo(7);
			g.addEdge(1, 2, 2);
			g.addEdge(2, 3, 3);
			g.addEdge(1, 4, 10);
			g.addEdge(4, 5, 8);
			g.addEdge(3, 4, 1);
			g.addEdge(5, 6, 5);
			g.addEdge(5, 7, 6);
			g.addEdge(6, 7, 4);
			g.Dijkstra();

		}
//Directed graph me cycle given hai or weight negative hai cycle ka  to koi dijstra or or koi algo kaam nhi karegi
	

}