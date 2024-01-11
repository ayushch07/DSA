package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree{
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public BinaryTree(){
        root=createtree();
    }
    Scanner sc=new Scanner(System.in);
    private Node createtree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.data=item;
        boolean hlc=sc.nextBoolean();//has left child.
        if(hlc){
            nn.left=createtree();
        }
        boolean hrc=sc.nextBoolean();//has right child.
        if(hrc){
            nn.right=createtree();
        }
          return nn;

    }
    public void display(){
        display(root);
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
        else{
            s="."+s;
        }
           if(nn.right!=null){
            s=s+nn.right.data;
        }
        else{
            s=s+".";
        }
        System.out.println(s);
        display(nn.left);
        display(nn.right);

    }
    public int max(){
        return max(root);
    }
    private int max(Node nn){
        if(nn==null){
            return Integer.MIN_VALUE;
        }
        int left=max(nn.left);
        int right=max(nn.right);
        return Math.max(nn.data, Math.max(left, right));
    }
    public boolean find(int item){
        return find(root,item);
    }
    private boolean find(Node nn,int item){
        if (nn == null) {
			return false;
		}

		if (nn.data == item) {
			return true;
		}
		boolean left = find(nn.left, item);
		boolean right = find(nn.right, item);
		return left || right;

    }
    public int ht(){
        return ht(root);
    }
    private int ht(Node nn){
        if(nn==null)
        return 0;//single node ki height 0 aega 
        //single node ki heigth 1 aega return 0 karenge.
        int lh=ht(nn.left);
        int rh=ht(nn.right);
        return Math.max(lh, rh)+1;
    }
    public void PreOrder() {
		PreOrder(this.root);
		System.out.println();
	}

	private void PreOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		System.out.print(node.data + " ");
		PreOrder(node.left);
		PreOrder(node.right);

	}
    public void postOrder() {
		postOrder(this.root);
		System.out.println();
	}

	private void postOrder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		
		postOrder(node.left);
		postOrder(node.right);
        System.out.print(node.data + " ");

	}

    public void inorder() {
		inorder(this.root);
		System.out.println();
	}

	private void inorder(Node node) {
		// TODO Auto-generated method stub
		if (node == null) {
			return;
		}
		
		inorder(node.left);
          System.out.print(node.data + " ");
	   inorder(node.right);
      

	}
    public void levelorder(){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node rv=q.remove();
            System.out.println(rv.data+" ");
            if(rv.left!=null){
                q.add(rv.left);
            }
            if(rv.right!=null){
                q.add(rv.right);
            }
        }
        System.out.println();

    }
    //linked list se stack banane ke lie add first or add last kardo kaam ho jaega
    //tree is not linear data structure like stack queue linked list etc 
    //find diameter wale question me O(N^2) complexity jaegi=T(n/2)(left diameter)+T(n/2)(right diameter)+T(n/2)(left tree height)+T(n/2)(right tree height);
    //tree ki complexity O(N) agar sab node ko ek baar visit kar rhe hai varna O(n^2);

  

}