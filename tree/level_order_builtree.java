package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class level_order_builtree{
    Scanner sc=new Scanner(System.in);
    public class Node{
        int data;
        Node left;
        Node right;
    }
    private Node root;
    public level_order_builtree(){
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
    public static void main(String args[]){
        level_order_builtree lbt=new level_order_builtree();
        lbt.PreOrder();
    }

}