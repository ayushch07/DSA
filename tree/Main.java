package tree;
import java.util.*;

public class Main{
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
   static Scanner sc=new Scanner(System.in);
    public Main(){
        createtree();
    }
    private void createtree() {
        Queue<Node> q=new LinkedList<>();
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
    this.root=nn;
    q.add(nn);
     while(!q.isEmpty()){
           Node rv=q.remove();
           int c1=sc.nextInt();
           int c2=sc.nextInt();
           if(c1!=-1){
            Node n=new Node();
            n.data=c1;
            rv.left=n;
            q.add(n);
           }
           if(c2!=-1){
            Node n=new Node();
            n.data=c2;
            rv.right=n;
            q.add(n);
           }
     }

     
    }
    public void display(){
        display(this.root);
    }
    private void display(Node nn){
        if (nn == null) {
          return;
      }
      String s="";
      s="<--"+nn.data+"-->";
    
      if(nn.left!=null){
          s=nn.left.data+s;
      }
      else
      s+=".";
      
         if(nn.right!=null){
          s=s+nn.right.data;
      }

        else
      s+=".";
    
      System.out.println(s);
      display(nn.left);
      display(nn.right);

  }
  static class Pair{
    int hd;
    Node node;
    public Pair(int hd,Node node){
        this.node=node;
        this.hd=hd;
    }
  }
   public void verticalorder(){
        verticalorder(this.root);
    }
  public static void verticalorder(Node root)
  {
    Queue<Pair> q=new ArrayDeque<>();
    Map<Integer,ArrayList<Integer>> map=new TreeMap<>();
    q.add(new Pair(0,root));
    while(!q.isEmpty())
    {
         Pair curr=q.poll();
         if(map.containsKey(curr.hd))
         {
            map.get(curr.hd).add(curr.node.data);
         }
         else{
            ArrayList<Integer> temp=new ArrayList<>();
            temp.add(curr.node.data);
            map.put(curr.hd, temp);
         }
         if(curr.node.left!=null)
         {
            q.add(new Pair(curr.hd-1, curr.node.left));
         }
           if(curr.node.right!=null)
         {
            q.add(new Pair(curr.hd+1, curr.node.right));
         }
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(Map.Entry<Integer,ArrayList<Integer>> entry:map.entrySet())
        {
            ans.addAll(entry.getValue());
        }
        System.out.println(ans);

  }
	 public static void main(String[] args) {
        int val=sc.nextInt();
        Main bt = new Main();
         bt.verticalorder();
		
    }
}
//when input is taken by array then below code
// import java.util.*;

// class TreeNode {
//     int data;
//     TreeNode left;
//     TreeNode right;

//     public TreeNode(int data) {
//         this.data = data;
//         this.left = null;
//         this.right = null;
//     }
// }

// public class Main {
//     public static void verticalTraversal(TreeNode root) {
//         if (root == null) {
//             return;
//         }

//         // Create a HashMap to store nodes at each vertical level
//         HashMap<Integer, List<Integer>> columnMap = new HashMap<>();
//         Queue<TreeNode> nodeQueue = new LinkedList<>();
//         Queue<Integer> columnQueue = new LinkedList<>();

//         // Initialize with the root node and its column ind (0)
//         nodeQueue.offer(root);
//         columnQueue.offer(0);

//         int minColumn = 0;
//         int maxColumn = 0;

//         // Perform level-order traversal
//         while (!nodeQueue.isEmpty()) {
//             TreeNode node = nodeQueue.poll();
//             int column = columnQueue.poll();

//             // Update min and max columns
//             minColumn = Math.min(minColumn, column);
//             maxColumn = Math.max(maxColumn, column);

//             // Add the node to the HashMap
//             if (!columnMap.containsKey(column)) {
//                 columnMap.put(column, new ArrayList<>());
//             }
//             columnMap.get(column).add(node.data);

//             // Enqueue left and right children with adjusted column indices
//             if (node.left != null) {
//                 nodeQueue.offer(node.left);
//                 columnQueue.offer(column - 1);
//             }
//             if (node.right != null) {
//                 nodeQueue.offer(node.right);
//                 columnQueue.offer(column + 1);
//             }
//         }

//         // Print nodes in each column from minColumn to maxColumn
//         for (int i = minColumn; i <= maxColumn; i++) {
//             List<Integer> columnNodes = columnMap.get(i);
//             for (int node : columnNodes) {
//                 System.out.print(node + " ");
//             }
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt(); // Number of levels
//         int[] levorder = new int[(1 << N) - 1]; // Array to store level order input

//         for (int i = 0; i < levorder.length; i++) {
//             levorder[i] = scanner.nextInt();
//         }

//         // Build the binary tree from the level order input
//         TreeNode root = buildTree(levorder);

//         // Call the verticalTraversal method to print the tree in vertical fashion
//         verticalTraversal(root);
//     }

//     // Helper function to build the binary tree from level order input
//     public static TreeNode buildTree(int[] levorder) {
//         if (levorder == null || levorder.length == 0) {
//             return null;
//         }

//         int ind = 0;
//         TreeNode root = new TreeNode(levorder[ind++]);
//         Queue<TreeNode> queue = new LinkedList<>();
//         queue.offer(root);

//         while (!queue.isEmpty() && ind < levorder.length) {
//             TreeNode curr = queue.poll();
//             int leftVal = levorder[ind++];
//             if (leftVal != -1) {
//                 curr.left = new TreeNode(leftVal);
//                 queue.offer(curr.left);
//             }

//             if (ind < levorder.length) {
//                 int rightVal = levorder[ind++];
//                 if (rightVal != -1) {
//                     curr.right = new TreeNode(rightVal);
//                     queue.offer(curr.right);
//                 }
//             }
//         }

//         return root;
//     }
// }


