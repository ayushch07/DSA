package Graph;

import java.util.*;

public class prims {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public prims(int v) {
		// TODO Auto-generated constructor stub
		this.map = new HashMap<>();
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);
		map.get(v2).put(v1, cost);
	}

	public class PrimsPair {

		int vx;
		int acqvx;
		int cost;

		public PrimsPair(int vx, int acqvx, int cost) {
			this.vx = vx;
			this.acqv = acqvx;
			this.cost = cost;
		}
		@Override
		public String toString() {
			return this.vx+" via "+ this.acqv+" @ "+this.cost;
		}

	}

	public void PrimsAlgo() {
        int ans=0;
		PriorityQueue<PrimsPair> pq = new PriorityQueue<>(new Comparator<PrimsPair>() {
			@Override
			public int compare(PrimsPair p1, PrimsPair p2) {
              return  p1.cost-p2.cost;
			}

		});
		HashSet<Integer> visited = new HashSet<>();
		pq.add(new PrimsPair(1, 1, 0));
		while (!pq.isEmpty()) {
		
			PrimsPair pp = pq.remove();

			
			if (visited.contains(pp.vx)) {
				continue;
			}
			visited.add(pp.vx);

			
			System.out.println(pp);
			ans+=pp.cost;

			
			for (int nbrs : map.get(pp.vx).keySet()) {
				if (!visited.contains(nbrs)) {
					PrimsPair np = new PrimsPair(nbrs, pp.vx, map.get(pp.vx).get(nbrs));
					pq.add(np);
				}

			}

		}
		System.out.println(ans);

	}

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        prims pm = new prims(n);
        int m = sc.nextInt();
        pm.AddEdge(1,4,6);
        pm.AddEdge(1,2,10);
        pm.AddEdge(2,3,7);
        pm.AddEdge(3,4,5);
        pm.AddEdge(4,5,1);
        pm.AddEdge(5,6,4);
        pm.AddEdge(1,4,6);
        pm.PrimsAlgo();
    }


	}