package Graph;
import java.util.*;

public class Graph {

	HashMap<Integer, HashMap<Integer, Integer>> map;

	public  Graph(int v) {
		this.map = new HashMap<>();//this lagao ya na lagao koi dikkat na he, dikkat tab hoti hai jab class ka data member or function ka local variable same naam ka ho
		for (int i = 1; i <= v; i++) {
			map.put(i, new HashMap<>());

		}
	}

	public  void AddEdge(int v1, int v2, int cost) {

		map.get(v1).put(v2, cost);// v1--> map get kra then put v2 and Cost
		map.get(v2).put(v1, cost);
		//System.out.println(map);
	}

	public boolean ContainsEdge(int v1, int v2) {
		return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);

	}

	public boolean Containsvertex(int v1) {
		return map.containsKey(v1);
	}

	public int noofEdge() {
		int sum = 0;
		for (int key : map.keySet()) {
			sum = sum + map.get(key).size();
		}
		return sum / 2;
	}

	public void removeEdge(int v1, int v2) {
		if (ContainsEdge(v1, v2)) {

			map.get(v1).remove(v2);
			map.get(v2).remove(v1);
		}

	}

	public void removevertex(int v1) {

		for (int key : map.get(v1).keySet()) {
			// removeEdge(key, v1);
			map.get(key).remove(v1);
		}
		map.remove(v1);

	}

	public void display() {
		for (int key : map.keySet()) {
			System.out.println(key + "-->" + map.get(key));
		}
	}

	public boolean hashpath(int src, int dis, HashSet<Integer> visited) {

		if (src == dis) {
			return true;
		}

		visited.add(src);
		//nbrs=neighbours
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				boolean ans = hashpath(nbrs, dis, visited);
				if (ans) {
					return ans;
				}
			}
		}
		visited.remove(src);
		return false;

	}

	public void printallpath(int src, int dis, HashSet<Integer> visited, String ans) {

		if (src == dis) {
			System.out.println(ans+src);
			return;
		}

		visited.add(src);
		for (int nbrs : map.get(src).keySet()) {
			if (!visited.contains(nbrs)) {
				printallpath(nbrs, dis, visited, ans + src + " ");

			}
		}
		visited.remove(src);

	}
	
	public void check(int src)//ye to mene kia tha timepass
	{
		System.out.println();
		for (int nbrs : map.get(src).keySet())
			{
				System.out.println(nbrs);
			}
		}
		public boolean BFS(int src, int dis) {//It guarantee of shortest path
			LinkedList<Integer> qq = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			qq.add(src);
			while (!qq.isEmpty()) {
				// remove
				int r = qq.remove();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				if (r == dis) {
					return true;
				}
				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						qq.add(nbrs);
					}
				}
	
			}
			return false;
	
		}
		public boolean DFS(int src, int dis) {//First element ko depth me check karta or ye shortest path ki guarantee nhi deta hai.
			Stack<Integer> st = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			st.push(src);
			while (!st.isEmpty()) {
				// remove
				int r = st.pop();
				// Ignore if Already Visited
				if (visited.contains(r)) {
					continue;
				}
				// visited mark
				visited.add(r);
				// work
				if (r == dis) {
					return true;
				}
				// nbrs add krna
				for (int nbrs : map.get(r).keySet()) {
					if (!visited.contains(nbrs)) {
						st.push(nbrs);
					}
				}
	
			}
			return false;
	
		}
		
		public void BFT() {
	
			LinkedList<Integer> qq = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
	
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
	
				qq.add(src);
				while (!qq.isEmpty()) {
					// remove
					int r = qq.remove();
					// Ignore if Already Visited
					if (visited.contains(r)) {
						continue;
					}
					// visited mark
					visited.add(r);
					// work
					System.out.print(r + " ");
					// nbrs add krna
					for (int nbrs : map.get(r).keySet()) {
						if (!visited.contains(nbrs)) {
							qq.add(nbrs);
						}
					}
	
				}
	
			}
	
		}
	
		public void DFT() {
	
			Stack<Integer> st = new Stack<>();
			HashSet<Integer> visited = new HashSet<>();
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				st.push(src);
				while (!st.isEmpty()) {
					// remove
					int r = st.pop();
					// Ignore if Already Visited
					if (visited.contains(r)) {
						continue;
					}
					// visited mark
					visited.add(r);
					// work
					System.out.print(r + " ");
					// nbrs add krna
					for (int nbrs : map.get(r).keySet()) {
						if (!visited.contains(nbrs)) {
							st.push(nbrs);
						}
					}
	
				}
			}
	
		}
	
		public boolean isCycle() {//agar graph ke andar nhi hai odd length ka to bipartite nhi hai or agar even length ka cycle hai to graph bipartite hai.
			LinkedList<Integer> qq = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				qq.add(src);
				while (!qq.isEmpty()) {
					// remove
					int r = qq.remove();
					// Ignore if Already Visited
					if (visited.contains(r)) {
						return true;
					}
					// visited mark
					visited.add(r);
	
					// nbrs add krna
					for (int nbrs : map.get(r).keySet()) {
						if (!visited.contains(nbrs)) {
							qq.add(nbrs);
						}
					}
	
				}
			}
			return false;
	
		}
	
		public boolean isConneted() {
			LinkedList<Integer> qq = new LinkedList<>();
			HashSet<Integer> visited = new HashSet<>();
			int count = 0;
			for (int src : map.keySet()) {
				if (visited.contains(src)) {
					continue;
				}
				count++;
				qq.add(src);
				while (!qq.isEmpty()) {
					// remove
					int r = qq.remove();
					// Ignore if Already Visited
					if (visited.contains(r)) {
						continue;
					}
					// visited mark
					visited.add(r);
	
					// nbrs add krna
					for (int nbrs : map.get(r).keySet()) {
						if (!visited.contains(nbrs)) {
							qq.add(nbrs);
						}
					}
	
				}
			}
			return count == 1;
	
		}
	
	}