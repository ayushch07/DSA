package Graph;
import java.util.HashMap;
public class DisJointSet {

	public class Node {
		int vtx;
		int rank;
		Node parent;
	}

	HashMap<Integer, Node> mp = new HashMap<>();

	public void CreateSet(int v) {
		Node node = new Node();
		node.vtx = v;
		node.rank = 0;
		node.parent = node;
		mp.put(v, node);

	}

	public int find(int v) {
		Node rn = mp.get(v);
		return find(rn).vtx;

	}

	private Node find(Node rn) {

		if (rn.parent == rn) {
			return rn;
		}
		Node ren = find(rn.parent);
		return ren;

	}

	public void union(int v1, int v2) {
		Node n1 = mp.get(v1);
		Node n2 = mp.get(v2);
		Node rn1 = find(n1);
		Node rn2 = find(n2);

		if (rn1.rank == rn2.rank) {
			rn1.parent = rn2;
			rn2.rank = rn2.rank + 1;
		} else if (rn1.rank > rn2.rank) {
			rn2.parent = rn1;
		} else {
			rn1.parent = rn2;
		}

	}

}

